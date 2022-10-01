package com.automatedapp.client;

import java.util.Scanner;

import com.automatedapp.bean.Administrator;
import com.automatedapp.bean.Buyer;
import com.automatedapp.dao.BuyerDao;
import com.automatedapp.dao.BuyerDaoImpl;
import com.automatedapp.exceptions.BuyerException;
import com.automatedapp.usecases.AdminLogin;
import com.automatedapp.usecases.GetAllBuyerUsecase;
import com.automatedapp.usecases.GetAllSellerUsecase;

public class Main {
	public static void main(String[] args) {

		System.out.println("Welcome to the Automated Auction System App \n");
		int choice = 0;
		do {
			System.out.println("1. Admin Login \n2. Buyer Login \n3. Seller Login \n4. Exit\n");

			Scanner scn = new Scanner(System.in);

			choice = scn.nextInt();

			switch (choice) {
			case 1:
				Administrator admin = AdminLogin.loginAdmin();

				System.out.println("\nWelcome " + admin.getaName().toUpperCase() + "\n");
				int c = 0;
				do {
					System.out.println(
							"1. View Registered Buyer List \n2. View Registered Seller List \n3. View Selling Report \n4. Go Back");

					c = scn.nextInt();

					switch (c) {
					case 1:
						GetAllBuyerUsecase.main(args);
						break;

					case 2:
						GetAllSellerUsecase.main(args);
						break;

					case 3:
						break;

					default:

						break;
					}
				} while (c != 4);
				break;

			case 2:
				BuyerDao dao = new BuyerDaoImpl();
				try {
					Buyer buyer = dao.loginBuyer();
					System.out.println("\nWelcome " + buyer.getbName().toUpperCase() + "\n");
					c = 0;
					do {
						System.out.println(
								"1. Search and view Items by Category \n2. Search Buyer \n3. View All Buyers \n4. Select Items to Buy \n5. Go Back");

						c = scn.nextInt();

						switch (c) {
						case 1:
							GetAllBuyerUsecase.main(args);
							break;

						case 2:
							GetAllSellerUsecase.main(args);
							break;

						case 3:
							break;

						default:

							break;
						}
					} while(c!=5);
					
					
				} catch (BuyerException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 3:

				break;

			case 4:
				System.out.println("==========================\nThank you for Believing us");
				break;
			}
		} while (choice != 4);
	}
}
