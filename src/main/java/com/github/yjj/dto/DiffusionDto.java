package com.github.yjj.dto;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.github.yjj.entity.Film;
import com.github.yjj.entity.Salle;
import com.github.yjj.entity.embed.DiffusionId;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("diffusion")
public class DiffusionDto {
	
	
	private int   idDiffusion;
	private Salle salle;
	private Film film;
	
	private String dateStart;
	private String timeStart;
	private String timeEnd;
	
	public DiffusionDto() {
		super();
	}
	
	public DiffusionDto(int idDiffusion, Salle salle, Film film, String dateStart, String timeStart, String timeEnd) {
		super();
		this.idDiffusion = idDiffusion;
		this.salle = salle;
		this.film = film;
		this.dateStart = dateStart;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}
	
	

	public DiffusionDto(Salle salle, Film film, String dateStart, String timeStart, String timeEnd) {
		super();
		this.salle = salle;
		this.film = film;
		this.dateStart = dateStart;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}



	

	public int getIdDiffusion() {
		return idDiffusion;
	}

	public void setIdDiffusion(int idDiffusion) {
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

	public String getDateStart() {
		return dateStart;
	}

	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}
	
	
	
	
	
}
