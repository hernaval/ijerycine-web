package com.github.yjj.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.rest.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.yjj.action.base.RestBaseAction;
import com.github.yjj.entity.Client;
import com.github.yjj.service.ClientService;
import com.github.yjj.util.QrCodeUtil;
import com.google.zxing.WriterException;
import com.opensymphony.xwork2.Validateable;

public class ClientsController extends RestBaseAction implements Validateable {

	Client model = new Client();
	List<Client> clients;
	
	String id;
	
	@Autowired
	ClientService clientService;
	
	public HttpHeaders show() {
		if(id !=null){
			model = clientService.get(id);
		}
		
		return null;
	}
	
	public HttpHeaders index(){
		
		if(clients ==null){
			clients = new ArrayList<Client>();
		}
		
		clients = clientService.getAll();
		return null;
	}
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return (clients != null ? clients : model);
	}

}
