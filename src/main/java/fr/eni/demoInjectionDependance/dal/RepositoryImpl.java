package fr.eni.demoInjectionDependance.dal;

import java.lang.reflect.Type;
import java.util.List;

import fr.eni.demoInjectionDependance.bo.Avis;
import fr.eni.demoInjectionDependance.bo.Film;
import fr.eni.demoInjectionDependance.bo.Genre;
import fr.eni.demoInjectionDependance.bo.Membre;
import fr.eni.demoInjectionDependance.bo.Participant;

public class RepositoryImpl {

	private List<Film> listFilm;
	private List<Avis> listAvis;
	private List<Genre> listGenre;
	private List<Membre> listMembre;
	private List<Participant> listParticipant;


	public static final String FILM = "film";
	public static final String AVIS = "avis";
	public static final String GENRE = "genre";
	public static final String MEMBRE = "membre";
	public static final String PARTICIPANT = "participant";
	
	
	

	public RepositoryImpl() {
		Film film = new Film("Hercule", 999, 3, "ça va faire mal");

		Film film2 = new Film("la cité de la peur", 999, 63, "oula");

		Film film3 = new Film("le cercle des pouets pouets", 9, 35, "pouet pouet pouet");
		listFilm.add(film);
		listFilm.add(film2);
		listFilm.add(film3);
		
	}

	
	
	public <T> List<T>findAll(String typ){
		switch(typ){
			case FILM :
				return (List<T>) listFilm;
			case AVIS : 
				return (List<T>) listAvis;
			case GENRE : 
				return (List<T>) listGenre;
			case MEMBRE : 
				return (List<T>) listMembre;
			case PARTICIPANT : 
				return (List<T>) listParticipant;
		}
		return null;
	}


	public <T> T findById(int id, String typ) {
		// TODO Auto-generated method stub
		switch(typ){
			case FILM :
				return (T) listFilm.get(id);
			case AVIS : 
				return (T) listAvis.get(id);
			case GENRE : 
				return (T) listGenre.get(id);
			case MEMBRE : 
				return (T) listMembre.get(id);
			case PARTICIPANT : 
				return (T) listParticipant.get(id);
		}
		return null;
	}

	
	public <T> void insert(T obj) {
		if(obj instanceof Film)	{ 
			Film f = (Film) obj;
			listFilm.add(f);
			f.setId(listFilm.size());
		}
		if(obj instanceof Avis)	{ 
			Avis a = (Avis) obj;
			listAvis.add(a); 
			a.setId(listAvis.size());
		}
		if(obj instanceof Genre){ 
			Genre g = (Genre) obj;
			listGenre.add(g);
			g.setId(listGenre.size());
		}
		if(obj instanceof Membre){ 
			Membre m = (Membre) obj;
			listMembre.add(m);
			m.setId(listGenre.size());
		}
		if(obj instanceof Participant){ 
			Participant p = (Participant) obj;
			listParticipant.add(p);
			p.setId(listParticipant.size());
		}
	}

	
	//public void delete() {
	//	// TODO Auto-generated method stub
	//	
	//}

	//public <T> List<T> upgrade() {
	//	// TODO Auto-generated method stub
	//	return null;
	//}

}
