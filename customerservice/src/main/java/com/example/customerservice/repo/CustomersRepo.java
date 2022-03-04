package com.example.customerservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customerservice.model.Customers;


public interface CustomersRepo extends JpaRepository<Customers,Integer>
{

	

	
}
