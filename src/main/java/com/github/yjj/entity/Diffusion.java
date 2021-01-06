package com.github.yjj.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="diffusion")
public class Diffusion implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idDiffusion;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "salle_id") 
	private Salle salle;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id") 
	private Film film;
	
		
	@Column(name="dateStart")
	private String dateStart;
	
	
	@Column(name="timeStart")
	private String timeStart;
	
		
	@Column(name="timeEnd")
	private String timeEnd;
	
	@OneToMany(mappedBy = "diffusion")
	private Set<Tarification> diffusionTarifications = new HashSet(); 

	
	
	public Diffusion(){}
	
	


	public Diffusion(int idDiffusion, Salle salle, Film film, String dateStart, String timeStart, String timeEnd) {
		super();
		this.idDiffusion = idDiffusion;
		this.salle = salle;
		this.film = film;
		this.dateStart = dateStart;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}




	public Diffusion(Salle salle, Film film, String dateStart, String timeStart, String timeEnd) {
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




	public Set<Tarification> getDiffusionTarifications() {
		return diffusionTarifications;
	}




	public void setDiffusionTarifications(Set<Tarification> diffusionTarifications) {
		this.diffusionTarifications = diffusionTarifications;
	}
	
	public void addTarification(Tarification tarif){
		diffusionTarifications.add(tarif);
	}

	
	
	
	
}
