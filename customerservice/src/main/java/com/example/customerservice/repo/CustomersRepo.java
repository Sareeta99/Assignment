package com.example.customerservice.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customerservice.model.Customers;

@Repository
@Transactional
public interface CustomersRepo extends JpaRepository<Customers,Integer>
{

	

	
}
