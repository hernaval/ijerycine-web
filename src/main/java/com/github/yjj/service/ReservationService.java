package com.github.yjj.service;

import java.util.List;

import com.github.yjj.dto.ReservationDto;
import com.github.yjj.entity.Diffusion;
import com.github.yjj.entity.Reservation;

public interface ReservationService {
	
	public void doSave(ReservationDto resa);
	
	public List<Reservation> getAlls();
	
	public List<Reservation> getResaByDiffusion(int id);
}
