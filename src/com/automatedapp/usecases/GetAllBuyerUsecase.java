package com.automatedapp.usecases;

import java.util.List;

import com.automatedapp.bean.Buyer;
import com.automatedapp.dao.AdministratorDao;
import com.automatedapp.dao.AdministratorDaoImpl;

import com.automatedapp.exceptions.BuyerException;

public class GetAllBuyerUsecase {

	public static void main(String[] args) {
		AdministratorDao dao = new AdministratorDaoImpl();

		try {
			List<Buyer> buyers = dao.getBuyerList();

			buyers.forEach(buyer -> {
				System.out.println("Buyer Id: " + buyer.getbId());
				System.out.println("Buyer Name: " + buyer.getbName());
				System.out.println("Buyer Email: " + buyer.getbEmail());
				System.out.println("==================================");
			});

		} catch (BuyerException e) {
			e.printStackTrace();
		}
	}
}
