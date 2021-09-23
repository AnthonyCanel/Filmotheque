package fr.eni.demoInjectionDependance.bo;

public class Membre {
	private long id;
	private String nom;
	private String prenom;
	private String login;
	private String pwd;
	private boolean isAdmin;
	//constructeur
	public Membre() {
		super();
	}
	public Membre(String nom, String prenom, String login, String pwd, boolean isAdmin) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pwd = pwd;
		this.isAdmin = isAdmin;
	}
	public Membre(long id, String nom, String prenom, String login, String pwd, boolean isAdmin) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pwd = pwd;
		this.isAdmin = isAdmin;
	}
	//getter/setter
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public boolean isIdAdmin() {
		return isAdmin;
	}
	public void setIdAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
}
