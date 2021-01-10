package com.github.yjj.service;

import java.util.List;

import com.github.yjj.entity.Film;

public interface FilmService {
	public List<Film> getAll();
	
	public void doSave(Film Film);
}
