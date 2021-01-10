package com.github.yjj.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.yjj.action.base.RestBaseAction;
import com.github.yjj.entity.Salle;
import com.github.yjj.service.SalleService;
import com.opensymphony.xwork2.Validateable;



public class SallesController extends RestBaseAction implements Validateable {
	
	
	Salle model = new Salle();
	List<Salle> salles;
	
	@Autowired
	SalleService salleService;
	
	public HttpHeaders index(){
		if(salles == null){
			salles = new ArrayList();
		}
		
		salles = salleService.getAll();
		
		return new DefaultHttpHeaders("index").disableCaching();
	}
	
	public HttpHeaders create()
	{
		salleService.doSave(model);
		return null;
	}
	

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return (salles != null ? salles : model);
	}

}
