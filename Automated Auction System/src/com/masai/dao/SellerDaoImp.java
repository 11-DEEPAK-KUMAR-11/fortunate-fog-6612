package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Buyer;
import com.masai.bean.Items;
import com.masai.bean.Seller;
import com.masai.exception.BuyerException;
import com.masai.exception.ItemException;
import com.masai.exception.SellerException;
import com.masai.utility.DBUtil;

public class SellerDaoImp implements SellerDao {

	@Override
	public String registerSeller(String name, String email, String password) {


		String message = "Not Inserted..";
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into Seller(sname,semail,spassword) values(?,?,?)");
			
			
			
			ps.setString(1, name);
			
			ps.setString(2, email);
			ps.setString(3, password);
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Seller Registered Sucessfully !";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		return message;
	}

	@Override
	public Seller loginSeller(String username, String password) throws SellerException {


        Seller seller = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from seller where semail = ? AND spassword = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				

				String n= rs.getString("sname");
				
				String e= rs.getString("semail");
				String p= rs.getString("spassword");
				
				
			    seller=new Seller( n, e, p);	
				
				
			}else
				throw new SellerException("Invalid Username or password.. ");
			
			
			
			
		} catch (SQLException e) {
			throw new SellerException(e.getMessage());
		}
		
		
		return seller;
		
	}

                   //	Item insertion in in item list
	
	@Override
	public String insertItems(String Pname, int price, String category,int itemId)  {


		String message = "Not Inserted..";
			
			try(Connection conn = DBUtil.provideConnection()) {
				
				
				 PreparedStatement ps= conn.prepareStatement("insert into items values(?,?,?,?)");
				 
				 
					
					
					ps.setString(1, Pname);	
					ps.setInt(2, price);
					ps.setString(3, category);
					ps.setInt(4, itemId);
					
					
					int x= ps.executeUpdate();	
					 
					if(x > 0)
						message="Record Inserted Sucessfully";
					
					 

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
			
			
			return message;
			
	}

	@Override
	public String updateItemList(String proName,int price , String category, int itemId) {
		
		String message = "Not Updated..";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			 PreparedStatement ps= conn.prepareStatement("update items set Pname=?,Price=?,Category=? where itemid =?");
			 
			 
				
				
				ps.setString(1, proName);	
				ps.setInt(2, price);
				ps.setString(3, category);
				ps.setInt(4, itemId);
				
				
				
				int x= ps.executeUpdate();	
				 
				if(x > 0)
					message="Record Updated Sucessfully";
				
				 

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
		return message;
	}

	@Override
	public String deleteItems(int itemId) {

		String message = "Not Deleted..";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			 PreparedStatement ps= conn.prepareStatement("delete from items where itemid =?");
			 
			 
				ps.setInt(1, itemId);
				
				
				
				int x= ps.executeUpdate();	
				 
				if(x > 0)
					message="Record Deleted Sucessfully";
				else
					message="Record does not exist.";
				 

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
		return message;
	}

}
