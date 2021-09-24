package fr.eni.demoInjectionDependance.controller;

import fr.eni.demoInjectionDependance.bo.Avis;
import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.bo.Genre;
import fr.eni.demoInjectionDependance.bo.Membre;
import fr.eni.demoInjectionDependance.bo.Participant;
import fr.eni.demoInjectionDependance.services.ManagerBllService;

public class Repository {

	private ManagerBllService<Film> ListFilm;
	private ManagerBllService<Avis> ListAvis;
	private ManagerBllService<Genre> ListGenre;
	private ManagerBllService<Participant> ListParticipant;
	private ManagerBllService<Membre> ListMembre;
	
	
	public Repository() {
		//données 

	}

	
	
	
}
