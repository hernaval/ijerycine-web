package com.github.yjj.service;

import java.io.IOException;
import java.util.List;

import com.github.yjj.dto.ReservationDto;
import com.github.yjj.entity.Diffusion;
import com.github.yjj.entity.Reservation;
import com.google.zxing.WriterException;

public interface ReservationService {
	
	public ReservationDto get(int id);
	
	public void doSave(ReservationDto resa, List<String> places) throws WriterException, IOException;
	
	public List<Reservation> getAlls();
	
	public List<Reservation> getResaByDiffusion(int id);
	
	public List<Reservation> getClientReservationByDiffusion(String  id, int diffusionId);
}
