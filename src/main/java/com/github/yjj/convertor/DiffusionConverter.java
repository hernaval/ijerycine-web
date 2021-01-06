package com.github.yjj.convertor;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import com.github.yjj.dto.DiffusionDto;
import com.github.yjj.entity.Diffusion;

public class DiffusionConverter {
	
	public static DiffusionDto toDto(Diffusion entity){
		DiffusionDto diff = new DiffusionDto();
		diff.setFilm(entity.getFilm());
		diff.setSalle(entity.getSalle());
		diff.setIdDiffusion(entity.getIdDiffusion());
		
		diff.setDateStart(entity.getDateStart());
		diff.setTimeStart(entity.getTimeStart());
		diff.setTimeEnd(entity.getTimeEnd()); 
		
		/*return new DiffusionDto(entity.getDiffusionId(),
				entity.getIdDiffusion(), entity.getSalle(),
				entity.getFilm(),
				entity.getTimeStart(),
				entity.getDateStart(),
				entity.getDateStart()
				); */
		return diff;
	}
	
	public static Diffusion toEntity(DiffusionDto dto) throws ParseException{
		return new Diffusion(
				dto.getIdDiffusion(), 
				dto.getSalle(),
				dto.getFilm(),
				dto.getDateStart(),
				dto.getTimeStart(),
				dto.getTimeEnd()
				);
	}
}
