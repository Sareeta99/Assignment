package com.example.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservice.model.Orders;
import com.example.orderservice.repo.OrderRepo;


@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepo repo;

	@Override
	public List<Orders> displayAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String insertOrder(Orders order) {
		// TODO Auto-generated method stub
		return"Order Added" ;
	}

	@Override
	public String deleteOrder(int oid) {
		// TODO Auto-generated method stub
		return "Orders Deleted";
	}

	

}
