package com.github.yjj.service.support;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.yjj.convertor.DiffusionConverter;
import com.github.yjj.convertor.OrderConverter;
import com.github.yjj.convertor.ReservationConverter;
import com.github.yjj.dao.BaseDAO;
import com.github.yjj.dto.DiffusionDto;
import com.github.yjj.dto.Order;
import com.github.yjj.dto.ReservationDto;
import com.github.yjj.entity.Diffusion;
import com.github.yjj.entity.Reservation;
import com.github.yjj.entity.TOrder;
import com.github.yjj.service.ReservationService;

@Service
public class ReservationsServiceImpl extends BaseServiceImpl implements ReservationService {
	
	@Resource
	BaseDAO<Reservation> resaDao;

	@Override
	public void doSave(ReservationDto resa) {
		Reservation reservation = ReservationConverter.toEntity(resa);
		
		resaDao.saveOrUpdate(reservation);
		
	}

	@Override
	public List<ReservationDto> getAlls() {
		List<Reservation> entities =  resaDao.find("from  Reservation as resa");
		System.out.println(entities);
		List<ReservationDto> reservations = new ArrayList();
		
		for(Reservation entity : entities){
			reservations.add(ReservationConverter.toDto(entity));
		}
		return reservations;
	}

}
