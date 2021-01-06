package com.github.yjj.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Film implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idFilm;
	
	@Column(name="titre")
	private String titre;
	
	@Column(name="duree")
	private String duree;
	
	@Column(name="genre")
	private String genre;
	
	@OneToMany(mappedBy = "film")
	private Set<Diffusion> filmDiffusions = new HashSet(); 
	
	public Film(){
		
	}
	
	
	
	public Film(int idFilm, String titre, String duree, String genre) {
		super();
		this.idFilm = idFilm;
		this.titre = titre;
		this.duree = duree;
		this.genre = genre;
		this.filmDiffusions = filmDiffusions;
	}



	public Film(String titre, String duree, String genre) {
		super();
		this.titre = titre;
		this.duree = duree;
		this.genre = genre;
	}

	public int getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(int idFilm) {
		this.idFilm = idFilm;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

	public Set<Diffusion> getFilmDiffusions() {
		return filmDiffusions;
	}

	public void setFilmDiffusions(Set<Diffusion> filmDiffusions) {
		this.filmDiffusions = filmDiffusions;
	}
	
	public void addDiffusion(Diffusion diff){
		filmDiffusions.add(diff);
	}

	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", titre=" + titre + ", duree=" + duree + ", genre=" + genre
				+ ", filmDiffusions=" + "]";
	}

	
	

	
	
}
