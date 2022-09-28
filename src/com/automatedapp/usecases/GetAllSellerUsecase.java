package com.automatedapp.usecases;

import java.util.List;

import com.automatedapp.bean.Seller;
import com.automatedapp.dao.AdministratorDao;
import com.automatedapp.dao.AdministratorDaoImpl;
import com.automatedapp.exceptions.SellerException;

public class GetAllSellerUsecase {
	public static void main(String[] args) {

		AdministratorDao dao = new AdministratorDaoImpl();
		
		try {
			List<Seller> sellers = dao.getSellerList();
			
		sellers.forEach(seller->{
			System.out.println("Seller Id: " + seller.getsId());
			System.out.println("Seller Name: " + seller.getsName());
			System.out.println("Seller Email: " + seller.getsEmail());
			System.out.println("==================================");
		});
			
		} catch (SellerException e) {
			System.out.println(e.getMessage());
		}

		
	}
}
