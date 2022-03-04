package com.example.orderservice.service;

import com.example.orderservice.model.Orders;

import java.util.List;

public interface OrderService {
	
	public List<Orders> displayAll(); //Read
	public String insertOrder(Orders order); //Create  //Update
	public String deleteOrder(int oid);  //Delete
	

}
