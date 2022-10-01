package com.automatedapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.automatedapp.bean.Buyer;

import com.automatedapp.exceptions.BuyerException;
import com.automatedapp.utility.DBUtil;

public class BuyerDaoImpl implements BuyerDao {

	@Override
	public Buyer loginBuyer() throws BuyerException {
		Buyer buyer = null;

		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter Buyer email: ");
			String aemail = scn.next();
			System.out.print("Enter Buyer password: ");
			String password = scn.next();

			Connection conn = DBUtil.getConnection();

			try {
				PreparedStatement ps = conn.prepareStatement("select * from administrator");
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					if (rs.getString("bEmail").equals(aemail) && rs.getString("bPassword").equals(password)) {
						buyer = new Buyer(rs.getInt("bId"), rs.getString("bName"), rs.getString("bemail"),
								rs.getString("bPassword"));
					}
				}
				if (buyer == null) {
					throw new BuyerException("Buyer not found");
				}

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return buyer;
	}

}
