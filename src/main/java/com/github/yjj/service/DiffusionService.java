package com.github.yjj.service;

import java.util.ArrayList;
import java.util.List;

import com.github.yjj.dto.DiffusionDto;
import com.github.yjj.entity.Diffusion;
import com.github.yjj.entity.Film;

public interface DiffusionService {

	public List<DiffusionDto> getAll();
	
	
	public ArrayList<Film> getFilm();
}
