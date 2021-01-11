package com.github.yjj.service.support;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.yjj.convertor.ClientConverter;
import com.github.yjj.convertor.OrderConverter;
import com.github.yjj.dao.BaseDAO;
import com.github.yjj.dto.ClientDto;
import com.github.yjj.entity.Client;
import com.github.yjj.entity.TOrder;
import com.github.yjj.service.ClientService;

@Service
public class ClientServiceImpl extends BaseServiceImpl implements ClientService {

	@Resource
	BaseDAO<Client> clientDao;
	
	@Override
	public Client get(String id) {
		// TODO Auto-generated method stub
		return clientDao.get(Client.class, id);
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return clientDao.find("from Client client");
	}
	
	

}
