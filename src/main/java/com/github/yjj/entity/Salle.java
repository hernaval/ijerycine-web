package com.github.yjj.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="salle")
public class Salle implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSalle;
	
	@Column(name="nomSalle")
	private String nomSalle;
	
	@OneToMany(mappedBy = "salle")
	private Set<Diffusion> salleDiffusions = new HashSet();
	
	
	public Salle(){}

	
	

	public Salle(String nomSalle) {
		super();
		this.nomSalle = nomSalle;
	}




	public Salle(int idSalle, String nomSalle) {
		super();
		this.idSalle = idSalle;
		this.nomSalle = nomSalle;
	}
	
	

	public int getIdSalle() {
		return idSalle;
	}



	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}



	public String getNomSalle() {
		return nomSalle;
	}

	public void setNomSalle(String nomSalle) {
		this.nomSalle = nomSalle;
	}
	
	

	public Set<Diffusion> getSalleDiffusions() {
		return salleDiffusions;
	}



	public void setSalleDiffusions(Set<Diffusion> salleDiffusions) {
		this.salleDiffusions = salleDiffusions;
	}
	
	public void addDiffusion(Diffusion diff){
		salleDiffusions.add(diff);
	}



	@Override
	public String toString() {
		return "Salle [idSalle=" + idSalle + ", nomSalle=" + nomSalle + ", ]";
	}
	
	
	
	
}
