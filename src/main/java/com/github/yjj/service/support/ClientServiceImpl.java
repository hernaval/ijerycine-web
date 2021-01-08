package com.github.yjj.service.support;

import java.math.BigDecimal;

import javax.annotation.Resource;

import com.github.yjj.convertor.ClientConverter;
import com.github.yjj.convertor.OrderConverter;
import com.github.yjj.dao.BaseDAO;
import com.github.yjj.dto.ClientDto;
import com.github.yjj.entity.Client;
import com.github.yjj.entity.TOrder;
import com.github.yjj.service.ClientService;

public class ClientServiceImpl extends BaseServiceImpl implements ClientService {

	@Resource
	BaseDAO<Client> clientDao;
	
	@Override
	public ClientDto get(String id) {
		// TODO Auto-generated method stub
		return ClientConverter.toDto(clientDao.get(Client.class, Integer.parseInt(id)));
	}

}
