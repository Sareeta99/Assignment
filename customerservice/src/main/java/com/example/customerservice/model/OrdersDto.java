package com.example.customerservice.model;

import javax.persistence.Entity;

@Entity

public class OrdersDto {
	
	
	int oid;
	
	int cid;
	
	String productname;
	
	String price;
	
	public OrdersDto(){
		
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public OrdersDto(int oid, int cid, String productname, String price) {
		super();
		this.oid = oid;
		this.cid = cid;
		this.productname = productname;
		this.price = price;
	}
	

}

