package fr.eni.demoInjectionDependance.bo;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
public class Film {
	
	private long id;
	@NotBlank
	@Size(min = 0, max = 20)
	private String titre;
	@Min(value=1900)
	private int annee;
	@Min(value=0)
	@Max(value=3600)
	private int duree;
	@Size(min = 0, max = 5000)
	private String synopsis;
	@NotNull
	private Participant realisateur;
	@NotNull
	private List<Participant> acteur;
	@NotNull
	private Genre genre;
	@NotNull
	private List<Avis> avis;
	//controle
	
	public Film() {
		super();
	}
	
	public Film(String titre, int annee, int duree, String synopsis) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
	}

	public Film(long id, String titre, int annee, int duree, String synopsis) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
	}
	public Film(String titre, int annee, int duree, String synopsis, Participant realisateur, List<Participant> acteur,
			Genre genre, List<Avis> avis) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
		this.realisateur = realisateur;
		this.acteur = acteur;
		this.genre = genre;
		this.avis = avis;
	}
	public Film(long id, String titre, int annee, int duree, String synopsis, Participant realisateur,
			List<Participant> acteur, Genre genre, List<Avis> avis) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
		this.realisateur = realisateur;
		this.acteur = acteur;
		this.genre = genre;
		this.avis = avis;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public Participant getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(Participant realisateur) {
		this.realisateur = realisateur;
	}
	public List<Participant> getActeur() {
		return acteur;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public List<Avis> getAvis() {
		return avis;
	}
	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}
	public void setActeur(List<Participant> acteur) {
		this.acteur = acteur;
	}
	
}
