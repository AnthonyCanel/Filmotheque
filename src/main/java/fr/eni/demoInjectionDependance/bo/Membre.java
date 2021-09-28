package fr.eni.demoInjectionDependance.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Membre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String prenom;
	private String login;
	private String pwd;
	private boolean isAdmin;

	//constructeurs personalisés
	public Membre(String nom, String prenom, String login, String pwd, boolean isAdmin) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pwd = pwd;
		this.isAdmin = isAdmin;
	}
}
