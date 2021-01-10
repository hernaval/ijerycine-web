package com.github.yjj.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.yjj.action.base.RestBaseAction;
import com.github.yjj.entity.Film;
import com.github.yjj.service.FilmService;
import com.opensymphony.xwork2.Validateable;

public class FilmsController extends RestBaseAction implements Validateable {

	Film model = new Film();
	List<Film> films;
	
	@Autowired
	FilmService filmService;
	
	public HttpHeaders index(){
		if(films ==null){
			films = new ArrayList();
		}
		films = filmService.getAll();
		
		return null;
	}
	
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return (films != null ? films : model);
	}

}
