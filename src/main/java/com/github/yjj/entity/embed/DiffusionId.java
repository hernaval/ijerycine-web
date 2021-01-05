package com.github.yjj.entity.embed;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DiffusionId implements Serializable {
	
	private int salleId;
	private int filmId;
	private int tempsId;
	public int getSalleId() {
		return salleId;
	}
	public void setSalleId(int salleId) {
		this.salleId = salleId;
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public int getTempsId() {
		return tempsId;
	}
	public void setTempsId(int tempsId) {
		this.tempsId = tempsId;
	}
	
	
	
	
	
}
