package com.web.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.spring.Reposistery.RRepposistery;
import com.web.spring.model.Registration;

@Service
public class RService {

	@Autowired
	RRepposistery dao;
	public void addProduct(Registration reg) {
		// TODO Auto-generated method stub
		dao.add(reg);
	}
	public  List<Registration>   list() {
		return dao.listPro();
	}

}
