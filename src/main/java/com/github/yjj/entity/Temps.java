package com.github.yjj.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="temps")
public class Temps implements Serializable {

	@Id
	@GeneratedValue
	private int idTemps;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dateStart")
	private Date dateStart;
	
	@Temporal(TemporalType.TIME)
	@Column(name="timeStart")
	private Date timeStart;
	
	@Temporal(TemporalType.TIME)
	@Column(name="timeEnd")
	private Date timeEnd;
	
	/*@OneToMany(mappedBy = "temps")
	private Collection<Diffusion> tempsDiffusions; */
	
	public Temps(){}

	public Temps(int idTemps, Date dateStart, Date timeStart, Date timeEnd) {
		super();
		this.idTemps = idTemps;
		this.dateStart = dateStart;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}

	public int getIdTemps() {
		return idTemps;
	}

	public void setIdTemps(int idTemps) {
		this.idTemps = idTemps;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	@Override
	public String toString() {
		return "Temps [idTemp=" + idTemps + ", dateStart=" + dateStart + ", timeStart=" + timeStart + ", timeEnd="
				+ timeEnd + ", tempsDiffusions=" + "]";
	}
	
	
	
	
}
