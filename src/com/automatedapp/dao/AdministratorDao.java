package com.automatedapp.dao;

import java.util.List;

import com.automatedapp.bean.Buyer;

public interface AdministratorDao {

	public List<Buyer> getBuyerList();
	public List<Buyer> getSellerList();
	
}
