package fr.eni.demoInjectionDependance.bo;

public class Participant {
	
	private long id;
	private String nom;
	private String prenom;
	//contructeurs
	public Participant() {
		
	}
	public Participant(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}
	public Participant(long id, String nom, String prenom) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	public long getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	//Getter/setter
	
	
	
	
}
