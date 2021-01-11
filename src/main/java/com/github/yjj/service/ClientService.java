package com.github.yjj.service;

import java.util.List;

import com.github.yjj.dto.ClientDto;
import com.github.yjj.entity.Client;

public interface ClientService {
	public Client get(String id);

	public List<Client> getAll();
}
