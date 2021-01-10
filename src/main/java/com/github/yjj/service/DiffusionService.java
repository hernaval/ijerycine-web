package com.github.yjj.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.github.yjj.dto.DiffusionDto;
import com.github.yjj.dto.TarificationDto;
import com.github.yjj.entity.Diffusion;
import com.github.yjj.entity.Film;

public interface DiffusionService {

	public List<Diffusion> getAll();
	public void doSave(DiffusionDto diff, List<TarificationDto> tarif) throws ParseException;
	
	public List<Diffusion> getSalleLibre(List<Object> params);
	
	public ArrayList<Film> getFilm();
}
