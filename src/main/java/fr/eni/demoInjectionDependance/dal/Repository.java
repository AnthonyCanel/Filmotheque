package fr.eni.demoInjectionDependance.dal;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import fr.eni.demoInjectionDependance.bo.Avis;
import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.bo.Genre;
import fr.eni.demoInjectionDependance.bo.Membre;
import fr.eni.demoInjectionDependance.bo.Participant;

@Controller
@Scope("singleton")
public class Repository {

    private List<Avis> listAvis = new ArrayList<>();
    private List<Film> listFilm = new ArrayList<>();
    private List<Genre> listGenre = new ArrayList<>();
    private List<Membre> listMembre = new ArrayList<>();
    private List<Participant> listParticipant = new ArrayList<>();; 
    //jeu de donnees de base
    private Repository() {
    	

    	Participant acteur0 = new Participant(0, "rose","panthere");
    	Participant acteur1 = new Participant(1, "bily","Petit");
    	Participant acteur2 = new Participant(2, "Azalet","la vache");
    	
    	Participant realisateur = new Participant(0, "starter","Anthony");
    	Participant realisateur2 = new Participant(1, "FunWaves","Ines");
    	Participant realisateur3 = new Participant(2, "Billgate","Julien");
    
    	Genre horror = new Genre(0, "Horreur");
    	Genre nianNian = new Genre(0, "nian nian");
    	Genre nanar = new Genre(0, "nanareeee");
    	Genre action = new Genre(0, "Action");
    	
    	Membre membre0 = new Membre(0, "membre0", "prenom0", "login0", "pwd0", false);
    	Membre membre1 = new Membre(1, "membre1", "prenom1", "login1", "pwd1", false);
    	Membre membre2 = new Membre(2, "membre2", "prenom2", "login2", "pwd2", false);
    
    	Film film0 = new Film(0,"la cite de la peur", 1996, 90, "il film drole fait par des nulls", realisateur,listParticipant,horror,null );
    	Film film1 = new Film(0,"crack, Le film", 1901, 99, "il va faire crack", realisateur2,listParticipant,nanar,null );
		
    	listParticipant.add(acteur0);
    	listParticipant.add(acteur1);
    	listParticipant.add(acteur2);
    	
    	listMembre.add(membre0);
    	listMembre.add(membre1);
    	listMembre.add(membre2);
    	
    	listGenre.add(horror);
    	listGenre.add(nanar);  
    	listGenre.add(action);
    	listGenre.add(nianNian);    
		
    	listFilm.add(film0);
    	listFilm.add(film1);
    }
    
    public List<Avis> getListAvis() {
		return listAvis;
	}
	public List<Film> getListFilm() {
		return listFilm;
	}
	public List<Genre> getListGenre() {
		return listGenre;
	}
	public List<Membre> getListMembre() {
		return listMembre;
	}
	public List<Participant> getListParticipant() {
		return listParticipant;
	}
}
