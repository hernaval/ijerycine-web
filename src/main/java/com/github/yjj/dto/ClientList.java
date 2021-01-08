package com.github.yjj.dto;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("data")
public class ClientList {

	List<ClientDto> clients;
	
	

	public ClientList() {
		
	}

	public List<ClientDto> getClients() {
		return clients;
	}

	public void setClients(List<ClientDto> clients) {
		this.clients = clients;
	}
	
	
}
