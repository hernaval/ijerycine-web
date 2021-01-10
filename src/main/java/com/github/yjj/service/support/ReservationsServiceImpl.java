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
	public List<Reservation> getAlls() {
		List<Reservation> entities =  resaDao.find("from  Reservation as resa");
		
		return entities;
	}

	@Override
	public List<Reservation> getResaByDiffusion(int id) {
		// TODO Auto-generated method stub
		return resaDao.find("from Reservation as resa join resa.diffusion as diff  where diff.idDiffusion = 1");
	}

}
