package fr.eni.demoInjectionDependance.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Avis implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Size(min = 0, max = 5)
	private int note;
	@NotBlank
	@Size(min = 0, max = 5000)
	private String commentaire;
	@NotNull
	@ManyToOne(targetEntity = Film.class)
	private Film film;
	@NotNull
	@OneToOne(targetEntity = Membre.class)
	private Membre membre;

	//Contructeurs personalise
	public Avis(int note, String commentaire, Film film, Membre membre) {
		this.note = note;
		this.commentaire = commentaire;
		this.film = film;
		this.membre = membre;
	}
}
