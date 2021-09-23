package fr.eni.demoInjectionDependance.bo;

public class Genre {
	private long id;
	private String libelle;
	public Genre() {
		super();
	}
	public Genre(String libelle) {
		super();
		this.libelle = libelle;
	}
	public Genre(long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	//getter/setter
	public long getId() {
		return id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
