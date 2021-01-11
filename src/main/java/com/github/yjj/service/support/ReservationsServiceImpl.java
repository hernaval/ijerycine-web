package com.github.yjj.service.support;

import java.io.IOException;
import java.math.BigDecimal;
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
import com.github.yjj.util.QrCodeUtil;
import com.google.zxing.WriterException;

@Service
public class ReservationsServiceImpl extends BaseServiceImpl implements ReservationService {
	
	@Resource
	BaseDAO<Reservation> resaDao;

	@Override
	public void doSave(ReservationDto resa, List<String> places) throws WriterException, IOException {
		
		
		
		for(String numPlace : places){
			Reservation entitie = ReservationConverter.toEntity(resa);
			entitie.setNumPlace(numPlace);
			resaDao.save(entitie);
			
			String pathW = "F:\\tpjava\\projet\\boiler\\qrImages\\"+entitie.getIdResa()+".png";
			String path = pathW.replace("\\", "/");
			QrCodeUtil.generateQr("navalona", 100, 100, path);
		}

		
	}

	@Override
	public List<Reservation> getAlls() {
		List<Reservation> entities =  resaDao.find("from  Reservation as resa");
		
		return entities;
	}

	@Override
	public List<Reservation> getResaByDiffusion(int id) {
		// TODO Auto-generated method stub
		List<Object> param = new ArrayList();
		param.add(id);
		return resaDao.find("from Reservation as resa join resa.diffusion as diff  where diff.idDiffusion = ?",param);
	}

	@Override
	public ReservationDto get(int id) {
		// TODO Auto-generated method stub
		 return ReservationConverter.toDto(resaDao.get(Reservation.class,id));
	}

	@Override
	public List<Reservation> getClientReservationByDiffusion(String clientId, int diffusionId) {
		List<Object> params = new ArrayList();
		params.add(clientId);
		params.add(diffusionId);
		return resaDao.find("from Reservation as resa join resa.diffusion as diff join resa.client as cli where cli.idClient = ? and  diff.idDiffusion = ? ",params);
	}

}
