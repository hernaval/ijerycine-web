package com.github.yjj.convertor;

import com.github.yjj.dto.DiffusionDto;
import com.github.yjj.entity.Diffusion;

public class DiffusionConverter {
	
	public static DiffusionDto toDto(Diffusion entity){
		DiffusionDto diff = new DiffusionDto();
		diff.setDiffusionId(entity.getIdDiffusion());
		diff.setSalle(entity.getSalle());
		diff.setFilm(entity.getFilm());
		//diff.setTemps(entity.getTemps());
		return  diff;
	}
	
	public static Diffusion toEntity(Diffusion dto){
		Diffusion diff = new Diffusion();
		diff.setFilm(dto.getFilm());
		diff.setSalle(dto.getSalle());
		diff.setTemps(dto.getTemps());
		
		return diff;
	}
}
