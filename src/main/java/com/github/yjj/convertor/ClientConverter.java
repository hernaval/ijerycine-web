package com.github.yjj.convertor;

import java.io.Serializable;

import com.github.yjj.dto.ClientDto;
import com.github.yjj.entity.Client;

public class ClientConverter implements Serializable {
	
	public static Client toEntity(ClientDto dto){
		return new Client(dto.getIdClient(), dto.getNom(), dto.getPrenom(), dto.getEmail(), dto.getTelephone(), dto.getPassword(), dto.getConfirmCode(), dto.getCreatedAt());
	}
	
	public static ClientDto toDto(Client entity){
		return new ClientDto(entity.getIdClient(), entity.getNom(), entity.getPrenom(), entity.getEmail(), entity.getTelephone(), entity.getPassword(), entity.getConfirmCode(), entity.getCreatedAt());
	}
}	
