package com.github.yjj.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="categorie")
public class Categorie implements Serializable {
	@Id
	private String nomCategorie;
	
	public Categorie(){
		
	}
	
	public Categorie(String nomCategorie){
		this.nomCategorie = nomCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	
	
	
}
