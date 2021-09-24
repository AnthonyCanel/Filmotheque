package fr.eni.demoInjectionDependance.bo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Avis {
	
	private long id;
	
	@Size(min = 0, max = 5)
	private int note;
	@NotBlank
	@Size(min = 0, max = 5000)
	private String commentaire;
	@NotNull
	private Film film;
	@NotNull
	private Membre membre;
	
	
	//contructeur
	public Avis() {
		super();
	}
	public Avis(int note, String commentaire, Film film, Membre membre) {
		super();
		this.note = note;
		this.commentaire = commentaire;
		this.film = film;
		this.membre = membre;
	}
	public Avis(long id, int note, String commentaire, Film film, Membre membre) {
		super();
		this.id = id;
		this.note = note;
		this.commentaire = commentaire;
		this.film = film;
		this.membre = membre;
	}
	//getter&Setter
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Membre getMembre() {
		return membre;
	}
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
	
}
