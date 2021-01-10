package com.github.yjj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.yjj.entity.Film;
import com.github.yjj.entity.Salle;


public interface SalleService {
	
	public List<Salle> getAll();
	
	public void doSave(Salle salle);
}
