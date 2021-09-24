package fr.eni.demoInjectionDependance.services;

import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.dal.RepositoryImpl;

public class FilmService {
	public FilmService(){
		RepositoryImpl mbs = new RepositoryImpl();
		mbs.insert(new Film("Joyeux noel", 2, 3, "poi"));
		mbs.insert(new Film("Inception", 2, 3, "Hanz Zimmer"));
		mbs.insert(new Film("La musique c'est trop bien", 2, 3, "Metallica"));
	}
}
