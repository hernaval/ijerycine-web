package com.github.yjj.service.support;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.yjj.dao.BaseDAO;
import com.github.yjj.entity.Client;
import com.github.yjj.entity.Film;
import com.github.yjj.entity.Salle;
import com.github.yjj.service.SalleService;

@Service
public class SallesServiceImpl extends BaseServiceImpl implements SalleService  {

	@Resource
	BaseDAO<Salle> salleDao;
	
	@Override
	public List<Salle> getAll() {
		// TODO Auto-generated method stub
		return salleDao.find("from Salle as salle ");
	}

	@Override
	public void doSave(Salle salle) {
		salleDao.saveOrUpdate(salle);
		
	}

}
