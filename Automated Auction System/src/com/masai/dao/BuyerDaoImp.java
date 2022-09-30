package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.exception.AdminException;
import com.masai.exception.BuyerException;
import com.masai.exception.SellerException;
import com.masai.utility.DBUtil;

public class BuyerDaoImp implements BuyerDao {

	@Override
	public String registerBuyer(String name, String email, String password) {
		 
		    String message = "Not Inserted..";
			
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps= conn.prepareStatement
						("insert into buyer(bname,bemail,bpassword) values(?,?,?)");
				
				
				
				ps.setString(1, name);
				
				ps.setString(2, email);
				ps.setString(3, password);
				
				int x= ps.executeUpdate();
				
				
				if(x > 0)
					message = "Buyer Registered Sucessfully !";
				
				
				
			} catch (SQLException e) {
				message = e.getMessage();
			}
			
			
		
		
			
			return message;
	}

	@Override
	public Buyer loginBuyer(String username, String password) throws BuyerException {

		Buyer buyer = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from buyer where bemail = ? AND bpassword = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				

				String n= rs.getString("bname");
				
				String e= rs.getString("bemail");
				String p= rs.getString("bpassword");
				
				
			    buyer=new Buyer( n, e, p);	
				
				
			}else
				throw new BuyerException("Invalid Username or password.. ");
			
			
			
			
		} catch (SQLException e) {
			throw new BuyerException(e.getMessage());
		}
		
		
		return buyer;
		
	}

	@Override
	public List<Seller> getAllSellerDetails() throws SellerException {
		// TODO Auto-generated method stub
		return null;
	}

}
