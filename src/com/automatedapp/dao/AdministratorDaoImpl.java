package com.automatedapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.automatedapp.bean.Buyer;
import com.automatedapp.bean.Seller;
import com.automatedapp.exceptions.BuyerException;
import com.automatedapp.exceptions.SellerException;
import com.automatedapp.utility.DBUtil;

public class AdministratorDaoImpl implements AdministratorDao{

	@Override
	public List<Buyer> getBuyerList() throws BuyerException {
		List<Buyer> buyers = new ArrayList<>();
	
		Connection conn = DBUtil.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from buyer");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("bid");
				String n = rs.getString("bname");
				String e = rs.getString("bemail");
				String p = rs.getString("bpassword");
				
				Buyer buyer = new Buyer(id, n, e, p);
				
				buyers.add(buyer);
			}
			
			if(buyers.size() == 0) {
				throw new BuyerException("Buyers doesn't exists");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return buyers;
	}

	@Override
	public List<Seller> getSellerList() throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

}
