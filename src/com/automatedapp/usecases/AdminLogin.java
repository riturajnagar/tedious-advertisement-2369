package com.automatedapp.usecases;

import com.automatedapp.bean.Administrator;
import com.automatedapp.dao.AdministratorDao;
import com.automatedapp.dao.AdministratorDaoImpl;
import com.automatedapp.exceptions.AdminException;

public class AdminLogin {

	public static Administrator loginAdmin() {
		Administrator admin = null;
		
		AdministratorDao dao = new AdministratorDaoImpl();
		try {
			admin =  dao.loginAdmin();
			if(admin == null) {
				throw new AdminException("No user found");
			}
		} catch (AdminException e) {
			System.out.println(e.getMessage());
		}
		
		return admin;
	}
}
