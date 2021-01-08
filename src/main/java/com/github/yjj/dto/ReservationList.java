package com.github.yjj.dto;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("data")
public class ReservationList implements Serializable {
	
	List<ReservationDto> reservations;

	public ReservationList() {
		
	}

	public List<ReservationDto> getReservations() {
		return reservations;
	}

	public void setReservations(List<ReservationDto> reservations) {
		this.reservations = reservations;
	}
	
	
	
	
}
