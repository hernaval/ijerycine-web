package com.github.yjj.service.support;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.yjj.dao.BaseDAO;
import com.github.yjj.entity.Film;
import com.github.yjj.service.FilmService;

@Service
public class FilmsServiceImpl extends BaseServiceImpl implements FilmService {
	
	@Resource
	BaseDAO<Film> filmDao;

	@Override
	public List<Film> getAll() {
		// TODO Auto-generated method stub
		return filmDao.find("from Film film");
	}

	@Override
	public void doSave(Film film) {
		filmDao.saveOrUpdate(film);
		
	}

}
