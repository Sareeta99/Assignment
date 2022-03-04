package com.example.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customerservice.model.Customers;
import com.example.customerservice.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomersController {
	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customers> showAll(){
		return service.displayAllCnames();
	}
	
	@PostMapping("/add")
	public String addCaddress(@RequestBody Customers caddress) {
		return service.insertcaddress(caddress);
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deletepost(@PathVariable("cid") int cid) {
		return service.deletecname(cid);
	}
	
	


}



