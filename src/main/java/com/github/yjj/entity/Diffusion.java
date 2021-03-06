package com.github.yjj.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

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
	
	@OneToMany(mappedBy ="diffusion")
	private Set<Reservation> resaDiffusions = new HashSet(); 
	
		
	@Column(name="dateStart")
	private String dateStart;
	
	
	@Column(name="timeStart")
	private String timeStart;
	
		
	@Column(name="timeEnd")
	private String timeEnd;
	
	@OneToMany(mappedBy = "diffusion")
	private Set<Tarification> diffusionTarifications = new HashSet(); 

	
	
	public Diffusion(){}
	
	
    

	public Diffusion(int idDiffusion, Salle salle, Film film, Set<Reservation> resaDiffusions, String dateStart,
			String timeStart, String timeEnd, Set<Tarification> diffusionTarifications) {
		super();
		this.idDiffusion = idDiffusion;
		this.salle = salle;
		this.film = film;
		this.resaDiffusions = resaDiffusions;
		this.dateStart = dateStart;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.diffusionTarifications = diffusionTarifications;
	}




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
	
	


	public Diffusion(int idDiffusion) {
		super();
		this.idDiffusion = idDiffusion;
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



	@JsonIgnore
	public Set<Tarification> getDiffusionTarifications() {
		return diffusionTarifications;
	}



	@JsonProperty
	public void setDiffusionTarifications(Set<Tarification> diffusionTarifications) {
		this.diffusionTarifications = diffusionTarifications;
	}
	
	public void addTarification(Tarification tarif){
		diffusionTarifications.add(tarif);
	}




	@JsonIgnore
	public Set<Reservation> getResaDiffusions() {
		return resaDiffusions;
	}



	@JsonProperty
	public void setResaDiffusions(Set<Reservation> resaDiffusions) {
		this.resaDiffusions = resaDiffusions;
	}
	
	

	
	
	
	
}
