package com.github.yjj.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.yjj.action.base.RestBaseAction;
import com.github.yjj.dto.ReservationDto;
import com.github.yjj.dto.ReservationList;
import com.github.yjj.entity.Client;
import com.github.yjj.entity.Diffusion;
import com.github.yjj.entity.Reservation;
import com.github.yjj.service.ReservationService;
import com.opensymphony.xwork2.Validateable;

public class ReservationsController extends RestBaseAction implements Validateable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ReservationDto model = new ReservationDto();
	List<Reservation> reservations ;

	
	@Autowired 
	ReservationService resaService;
	
	String diffusionId;
	String clientId;
	String nom;
	String prenom;
	String email;
	
	String id;
	
	
	public HttpHeaders index(){
		
		if(id ==null){
			reservations = new ArrayList();
		}
		reservations = resaService.getAlls();
		
		
		return new DefaultHttpHeaders("index").disableCaching();
	}
	
	public HttpHeaders show(){
		
		if(id != null){
			reservations = new ArrayList();
			
			
			
		}
		reservations = resaService.getResaByDiffusion(Integer.parseInt(id));  
		System.out.println(reservations.get(0));
		
		return new DefaultHttpHeaders("index").disableCaching();
		
	}
	
	public HttpHeaders create(){
		
		
		Diffusion diff = new Diffusion(Integer.parseInt(getDiffusionId()));
		
		if(getClientId() == null){
			Client c = new Client(getEmail(),getNom(),getPrenom());
			model.setClient(c);
		}

		model.setDiffusion(diff);
		model.setStatus(true);
		resaService.doSave(model);
		
		return null;
	}
	
	
	
	public String getDiffusionId() {
		return diffusionId;
	}

	public void setDiffusionId(String diffusionId) {
		this.diffusionId = diffusionId;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return reservations != null ? reservations : model;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

}
