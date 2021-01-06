package com.github.yjj.entity.embed;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class DiffusionId implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int salleId;
	private int filmId;
	
	

	public DiffusionId() {
		super();
	}
	public DiffusionId(int salleId, int filmId) {
		super();
		this.salleId = salleId;
		this.filmId = filmId;
	}
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
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(getSalleId(), getFilmId());
	}
	
	
	
	
	
	
}
