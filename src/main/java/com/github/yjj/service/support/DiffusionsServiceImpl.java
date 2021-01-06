package com.github.yjj.service.support;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.yjj.convertor.DiffusionConverter;
import com.github.yjj.convertor.OrderConverter;
import com.github.yjj.dao.BaseDAO;
import com.github.yjj.dto.DiffusionDto;
import com.github.yjj.entity.Diffusion;
import com.github.yjj.entity.Film;
import com.github.yjj.entity.Salle;
import com.github.yjj.entity.TOrder;
import com.github.yjj.service.DiffusionService;
import com.github.yjj.service.OrderService;

@Service
public class DiffusionsServiceImpl  extends BaseServiceImpl implements DiffusionService {

	@Resource
	BaseDAO<Diffusion> diffDao;
	
	@Resource
	BaseDAO<Film> filmDao;
	
	@Override
	public List<DiffusionDto> getAll() {
		// TODO Auto-generated method stub
		List<Diffusion> entities =  diffDao.find("from  Diffusion as diff");
		System.out.println(entities);
		List<DiffusionDto> diffusions = new ArrayList();
		
		for(Diffusion entity : entities){
			diffusions.add(DiffusionConverter.toDto(entity));
		}
		return diffusions;
	}

	@Override
	public ArrayList<Film> getFilm() {
		// TODO Auto-generated method stub
		
		return (ArrayList<Film>) filmDao.find("select diff from Film diff");
	}

	@Override
	public void doSave(DiffusionDto diff) throws ParseException {
		// hibernate
		Diffusion entity = DiffusionConverter.toEntity(diff);
		//Diffusion isEntity = (Diffusion) getCurrentSession().get(Diffusion.class,entity.getIdDiffusion());
			
			
			/*if(isEntity != null ){
				entity = isEntity;
				// update fields set
				entity.setFilm(diff.getFilm());
				entity.setSalle(diff.getSalle());
				entity.setDateStart(diff.getDateStart());
				entity.setTimeStart(diff.getTimeStart());
				entity.setTimeEnd(diff.getTimeEnd());
			} */
		
		
		getCurrentSession().saveOrUpdate(entity); 
	}

	

}
