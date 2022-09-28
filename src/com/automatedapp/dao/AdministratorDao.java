package com.automatedapp.dao;

import java.util.List;

import com.automatedapp.bean.Buyer;
import com.automatedapp.bean.Seller;
import com.automatedapp.exceptions.BuyerException;
import com.automatedapp.exceptions.SellerException;

public interface AdministratorDao {

	public List<Buyer> getBuyerList() throws BuyerException;
	public List<Seller> getSellerList() throws SellerException;	
	
}
