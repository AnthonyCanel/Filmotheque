package fr.eni.demoInjectionDependance.bo;

public class Avis {
	private long id;
	private int note;
	private String commentaire;
	private Film film;
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
