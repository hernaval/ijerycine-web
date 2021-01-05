package com.github.yjj.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="reservation")
public class Reservation implements Serializable {
	@Id
	@GeneratedValue
	private int idResa;
	
	

	public Reservation() {
		
	}

	public int getIdResa() {
		return idResa;
	}

	public void setIdResa(int idResa) {
		this.idResa = idResa;
	}
	
	
}
