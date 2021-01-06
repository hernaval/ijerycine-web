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
import com.github.yjj.entity.embed.DiffusionId;
import com.github.yjj.service.DiffusionService;
import com.opensymphony.xwork2.Validateable;

import net.sf.json.JSONObject;

public class DiffusionsController extends RestBaseAction implements Validateable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3408270573310310844L;
	
	DiffusionDto model;
	DiffusionId diffusion = new DiffusionId();
	DiffusionList diffusions;
	
	String dateStart;
	String timeStart;
	String timeEnd;
	
	
	
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
		Film f = new Film(); f.setIdFilm(diffusion.getFilmId());
		Salle s  = new Salle(); s.setIdSalle(diffusion.getSalleId());
		String date =  getDateStart();
		String start = getTimeStart();
		String end = getTimeEnd();
		
		System.out.println("data = "+date+" stat = "+start+" end "+end);
		
		
		model = new DiffusionDto(s, f, date, start, end);
		
		
		diffService.doSave(model);
		
		
		return null;
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
