package com.github.yjj.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.github.yjj.entity.Film;
import com.github.yjj.entity.Salle;
import com.github.yjj.entity.Temps;
import com.github.yjj.entity.embed.DiffusionId;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("diffusion")
public class DiffusionDto {
	
	private DiffusionId diffusionId;
	public DiffusionDto(DiffusionId diffusionId, Salle salle, Film film, Temps temps) {
		super();
		this.diffusionId = diffusionId;
		this.salle = salle;
		this.film = film;
		this.temps = temps;
	}


	public DiffusionId getDiffusionId() {
		return diffusionId;
	}


	public void setDiffusionId(DiffusionId diffusionId) {
		this.diffusionId = diffusionId;
	}



	private Salle salle;
	private Film film;
	private Temps temps;
	
	
	
	public DiffusionDto() {
		
	}

	
	public DiffusionDto(Salle salle, Film film, Temps temps) {
		
	
		this.salle = salle;
		this.film = film;
		this.temps = temps;
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



	@Override
	public String toString() {
		return "DiffusionDto [salle=" + salle + ", film=" + film + ", temps=" + temps
				+ "]";
	}
	
	
	
	
	
	
}
