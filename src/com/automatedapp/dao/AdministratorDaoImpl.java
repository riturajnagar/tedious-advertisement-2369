package com.automatedapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.automatedapp.bean.Administrator;
import com.automatedapp.bean.Buyer;
import com.automatedapp.bean.Seller;
import com.automatedapp.exceptions.AdminException;
import com.automatedapp.exceptions.BuyerException;
import com.automatedapp.exceptions.SellerException;
import com.automatedapp.utility.DBUtil;

public class AdministratorDaoImpl implements AdministratorDao {

	@Override
	public List<Buyer> getBuyerList() throws BuyerException {
		List<Buyer> buyers = new ArrayList<>();

		Connection conn = DBUtil.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from buyer");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("bid");
				String n = rs.getString("bname");
				String e = rs.getString("bemail");
				String p = rs.getString("bpassword");

				Buyer buyer = new Buyer(id, n, e, p);

				buyers.add(buyer);
			}

			if (buyers.size() == 0) {
				throw new BuyerException("Buyers doesn't exists");
			}

		} catch (SQLException e) {
			throw new BuyerException(e.getMessage());
		}

		return buyers;
	}

	@Override
	public List<Seller> getSellerList() throws SellerException {
		List<Seller> sellers = new ArrayList<>();

		Connection conn = DBUtil.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from seller");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("sid");
				String n = rs.getString("sname");
				String e = rs.getString("semail");
				String p = rs.getString("spassword");

				Seller seller = new Seller(id, n, e, p);

				sellers.add(seller);
			}

			if (sellers.size() == 0) {
				throw new SellerException("Sellers doesn't exists");
			}

		} catch (SQLException e) {
			throw new SellerException(e.getMessage());
		}

		return sellers;
	}

	@Override
	public Administrator loginAdmin() throws AdminException {
		Administrator admin = null;

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter admin email: ");
		String aemail = scn.next();
		System.out.print("Enter admin password: ");
		String password = scn.next();

		Connection conn = DBUtil.getConnection();

		try {
			PreparedStatement ps = conn.prepareStatement("select * from administrator");
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				admin = new Administrator(rs.getInt("aId"), rs.getString("aName"), rs.getString("aemail"),
						rs.getString("aPassword"));
			} else {
				throw new AdminException("Admin not found");
			}
			
			if(admin.getaEmail().equals(aemail) && admin.getaPassword().equals(password)) {
				System.out.println("Login Successfull");
			}else {
				
				throw new AdminException("Incorrect Id or Password");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return admin;
	}

}
