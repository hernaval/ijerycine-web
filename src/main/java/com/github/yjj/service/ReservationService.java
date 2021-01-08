package com.github.yjj.service;

import java.util.List;

import com.github.yjj.dto.ReservationDto;

public interface ReservationService {
	
	public void doSave(ReservationDto resa);
	
	public List<ReservationDto> getAlls();
}
