package com.automatedapp.dao;

import com.automatedapp.bean.Buyer;

import com.automatedapp.exceptions.BuyerException;

public interface BuyerDao {
	public Buyer loginBuyer() throws BuyerException;
}
