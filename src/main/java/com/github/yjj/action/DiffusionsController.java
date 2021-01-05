package com.github.yjj.action;

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
import com.github.yjj.service.DiffusionService;
import com.opensymphony.xwork2.Validateable;

import net.sf.json.JSONObject;

public class DiffusionsController extends RestBaseAction implements Validateable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3408270573310310844L;
	
	DiffusionDto model = new DiffusionDto();
	DiffusionList diffusions;
	List<Diffusion> test;
	ArrayList<Film> films;
	
	@Autowired
	DiffusionService diffService;
	
	public HttpHeaders show()
	{
		
		films = diffService.getFilm();
		
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
	
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return (diffusions != null ? diffusions : model);
	}

}
