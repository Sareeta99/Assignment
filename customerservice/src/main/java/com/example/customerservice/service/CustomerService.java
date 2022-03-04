package com.example.customerservice.service;

import java.util.List;

import com.example.customerservice.model.Customers;


public interface CustomerService {
	
	public String insertcaddress(Customers caddress);
    public List<Customers> displayAllCnames();
    public String deletecname(int cid);
   
	
	
}
