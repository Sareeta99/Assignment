package com.example.customerservice.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerservice.model.Customers;
import com.example.customerservice.repo.CustomersRepo;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomersRepo repo;
	
	@Override
	public String insertcaddress(Customers caddress) {
		// TODO Auto-generated method stub
		repo.save(caddress);
		return  "caddress added";
	}

	@Override
	public List<Customers> displayAllCnames() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deletecname(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "cname deleted";
	}


}
