package fr.eni.demoInjectionDependance.controller;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.demoInjectionDependance.bo.Avis;
import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.dal.FilmDao;
import fr.eni.demoInjectionDependance.dal.RepositoryImpl;


@Controller
@RequestMapping("/film")
@SessionAttributes({"filmS"})
public class FilmController {
	
	@Autowired
	private FilmDao filmDao;
	
	
	@GetMapping("/ajouter")
	public String ajouterFilm(Model modele) {

		modele.addAttribute("film", new Film());
		return "ajouterFilm";
	}
	@PostMapping("/ajouter")
	public String ajouterFilm(@Valid @ModelAttribute Film film,BindingResult resultFilm,@Valid @ModelAttribute ("filmS") List<Film> filmsEnSession,BindingResult resultListFilm) {
		System.out.println("je suis dansle post"+film.getTitre());
//		filmDao.saveAndFlush(film);
		filmsEnSession.add(film);
		
		return "redirect:/film";
	}
	@ModelAttribute("filmS")
	public ArrayList<Film> filmsEnSession() {
			
	   return new ArrayList<Film>();
	}	
	@GetMapping("")
	public String afficherListFilms(Model modele, @ModelAttribute ("filmS") List<Film> filmsEnSession) {
	
		modele.addAttribute("filmS", filmsEnSession);
		
		System.out.println(filmsEnSession.size());
		return "listFilms";
	}
	
	@GetMapping("/{id}")
	public String afficherFilm(@PathVariable int id, Model modele){
		Film film = new Film();
		film.setTitre("titre1");
		film.setAnnee(1986);
		film.setDuree(1);
		film.setSynopsis("sys");
		RepositoryImpl s = new RepositoryImpl();
		Avis a = s.findById(id, RepositoryImpl.AVIS);
		modele.addAttribute("film",film);
		return "detailFilm";
	}
}
