package fr.eni.demoInjectionDependance.controller;

import javax.validation.Valid;

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

	@Autowired
	private FilmService filmService;
	
	@GetMapping("/ajouter")
	public String ajouterFilm(Model modele) {
		modele.addAttribute("film", new Film());
		return "ajouterFilm";
	}
	@PostMapping("/ajouter")
	public String ajouterFilm(@Valid @ModelAttribute Film film, BindingResult result, Model modele ) {
		if(result.hasErrors()){
            modele.addAttribute("film", film);
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
