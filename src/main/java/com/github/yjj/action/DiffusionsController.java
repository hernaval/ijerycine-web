package com.github.yjj.action;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.yjj.action.base.RestBaseAction;
import com.github.yjj.dto.DiffusionDto;
import com.github.yjj.dto.DiffusionList;
import com.github.yjj.entity.Diffusion;
import com.github.yjj.entity.Film;
import com.github.yjj.entity.Salle;
import com.github.yjj.service.DiffusionService;
import com.opensymphony.xwork2.Validateable;

import net.sf.json.JSONObject;

public class DiffusionsController extends RestBaseAction implements Validateable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3408270573310310844L;
	
	DiffusionDto model;
	Diffusion diffusion = new Diffusion();
	DiffusionList diffusions;
	
	int filmId;
	int salleId;
	
	
	
	@Autowired
	DiffusionService diffService;
	
	public HttpHeaders show()
	{
		
				
		return new DefaultHttpHeaders("index").disableCaching();
	}
	
	// GET /diffusions.json
	public HttpHeaders index(){
		
		if(diffusions == null){
			diffusions = new DiffusionList();
		}
		
		diffusions.setDiffusions(diffService.getAll());
		System.out.println(diffService.getAll()); 
		
		return new DefaultHttpHeaders("index").disableCaching();
	}
	
	public HttpHeaders create() throws ParseException{
		
		Film f = new Film(); f.setIdFilm(getFilmId());
		Salle s  = new Salle(); s.setIdSalle(getSalleId());
		String date =  diffusion.getDateStart();
		String start = diffusion.getTimeStart();
		String end = diffusion.getTimeEnd();
		
		System.out.println("data = "+date+" stat = "+start+" end "+end);
		
		
		model = new DiffusionDto(s, f, date, start, end);
		
		
		diffService.doSave(model); 
		
		
		return null;
	}

	
	
	
	
	
	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public int getSalleId() {
		return salleId;
	}

	public void setSalleId(int salleId) {
		this.salleId = salleId;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return (diffusions != null ? diffusions : diffusion);
	}
	
	
	

}
