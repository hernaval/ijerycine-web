package com.github.yjj.convertor;

import com.github.yjj.dto.ReservationDto;
import com.github.yjj.entity.Reservation;

public class ReservationConverter {
	public static Reservation toEntity(ReservationDto dto){
		return new  Reservation(dto.getIdResa(), dto.getQrImage(), dto.getCategorie(), dto.getNumPlace(), dto.isStatus(), dto.getCreatedAt(),dto.getDiffusion(),dto.getClient());
	}
	
	public static ReservationDto toDto(Reservation entity){
		return new  ReservationDto(entity.getIdResa(), entity.getQrImage(), entity.getCategorie(), entity.getNumPlace(), entity.isStatus(), entity.getCreatedAt(),entity.getDiffusion(),entity.getClient());
	}
}
