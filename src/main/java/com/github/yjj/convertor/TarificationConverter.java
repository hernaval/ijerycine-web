package com.github.yjj.convertor;

import com.github.yjj.dto.TarificationDto;
import com.github.yjj.entity.Tarification;

public class TarificationConverter {

	public static TarificationDto toDto(Tarification entity){
		return new TarificationDto(entity.getIdTarif(),entity.getNomCategorie(),entity.getPrix(),entity.getDiffusion());
	}
	
	public static Tarification toEntity(TarificationDto dto){
		return new Tarification(dto.getIdTarif(),dto.getNomCategorie(),dto.getPrix(),dto.getDiffusion());
	}
}
