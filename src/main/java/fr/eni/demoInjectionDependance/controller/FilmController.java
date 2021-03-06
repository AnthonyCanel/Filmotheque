package fr.eni.demoInjectionDependance.controller;

import javax.validation.Valid;

import fr.eni.demoInjectionDependance.dal.GenreDao;
import fr.eni.demoInjectionDependance.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.services.FilmService;


@Controller
@RequestMapping("/film")
public class FilmController {

	//Injection des services
	private FilmService filmService;
	@Autowired
	private void setFilmService(FilmService filmService){
		this.filmService = filmService;
	}

	private ParticipantService participantService;
	@Autowired
	private void setParticipantService(ParticipantService participantService){
		this.participantService = participantService;
	}

	private GenreDao genreDao;
	@Autowired
	private void setGenreDao(GenreDao genreDao){
		this.genreDao = genreDao;
	}

	//Methodes d'acces au controlleur
	@GetMapping("/ajouter")
	public String ajouterFilm(Model modele) {
		modele.addAttribute("film", new Film());
		modele.addAttribute("participants", participantService.getAll());
		modele.addAttribute("genres", genreDao.findAll());
		return "ajouterFilm";
	}
	@PostMapping("/ajouter")
	public String ajouterFilm(@Valid @ModelAttribute Film film, BindingResult result, Model modele ) {
		if(result.hasErrors()){
			modele.addAttribute("film", film);
			modele.addAttribute("participants", participantService.getAll());
			modele.addAttribute("genres", genreDao.findAll());
            return "ajouterFilm";
		}else{
		    filmService.add(film);
		    return "redirect:/film";
		}
	}
		
	@GetMapping("")
	public String afficherListFilms(Model modele) {
	
		modele.addAttribute("listFilm", filmService.getAll());
		System.out.println(filmService.getAll());
		return "listFilms";
	}
	
	@GetMapping("/{id}")
	public String afficherFilm(@PathVariable int id, Model modele){

		modele.addAttribute("film", filmService.getById(id));
		return "detailFilm";
	}
}
