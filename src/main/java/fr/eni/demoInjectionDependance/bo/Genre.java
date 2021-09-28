package fr.eni.demoInjectionDependance.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
	private long id;
	private String libelle;

	//constructeurs personalisés
	public Genre(String libelle) {
		super();
		this.libelle = libelle;
	}
}
