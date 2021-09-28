package fr.eni.demoInjectionDependance.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	@ManyToOne(targetEntity = Participant.class)
	private Participant realisateur;

	@OneToMany(targetEntity = Participant.class)
	private List<Participant> acteur;
	
	@NotNull
	@ManyToOne (targetEntity = Genre.class)
	private Genre genre;

	@ManyToOne(targetEntity = Avis.class)
	private List<Avis> avis;
	//controle

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
}
