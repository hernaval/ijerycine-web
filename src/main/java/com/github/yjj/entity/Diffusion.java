package com.github.yjj.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.github.yjj.entity.embed.DiffusionId;

@Entity
@Table(name="diffusion")
public class Diffusion implements Serializable{
	
	@EmbeddedId
	private DiffusionId idDiffusion = new DiffusionId();
	
	@ManyToOne
	@MapsId("salleId")
	private Salle salle;
	
	@ManyToOne
	@MapsId("filmId")
	private Film film;
	
	@ManyToOne
	@MapsId("tempsId")
	private Temps temps;

	public DiffusionId getIdDiffusion() {
		return idDiffusion;
	}

	public void setIdDiffusion(DiffusionId idDiffusion) {
		this.idDiffusion = idDiffusion;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Temps getTemps() {
		return temps;
	}

	public void setTemps(Temps temps) {
		this.temps = temps;
	}

	
	
	
	
	
}
