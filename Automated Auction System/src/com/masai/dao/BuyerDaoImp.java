package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Buyer;
import com.masai.bean.Items;
import com.masai.bean.Seller;
import com.masai.exception.AdminException;
import com.masai.exception.BuyerException;
import com.masai.exception.ItemException;
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

	
	// search and views itmes category wise
	
	@Override
	public List<Items> getItemByCategory(String name) throws ItemException {
		

		List<Items> itemList= new ArrayList<>();
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from items where Category = ?");
			
			ps.setString(1, name);
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				String n= rs.getString("Pname");
				int r= rs.getInt("Price");
				String e= rs.getString("Category");
				
				
				
			Items s=new Items(n,r,e);	
				
			itemList.add(s);
				
				
				
			}
		
		} catch (SQLException e) {
			throw new ItemException(e.getMessage());
		}
		
		
		if(itemList.size() == 0)
			throw new ItemException("No Items data found..");
		
		
		
		
		return itemList;
		
	}
	
	
	@Override
	public void getAllItemsWithSellerDetails() throws SellerException {
		
		//select i.Pname,i.Price, i.Category, s.sname from items i INNER JOIN seller s ON itemid=sid;

		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select i.Pname,i.Price, i.Category, s.sname from items i INNER JOIN seller s ON itemid=sid");
			
			ResultSet rs= ps.executeQuery();
			
			boolean flag= true;
			
			while(rs.next()) {
			
				flag = false;
				String n= rs.getString("Pname");
				int p= rs.getInt("Price");
				String c= rs.getString("Category");
				String s= rs.getString("sname");
				
				System.out.println("Product Category :"+c);
				System.out.println("Product Name :"+n);
				System.out.println("Product Price :"+p);
				System.out.println("Seller Name :"+s);
				
				System.out.println("=========================");
			}
			
			
			if(flag)
				System.out.println("There is no record..");
			
		
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
//			throw new ItemException(e.getMessage());
		}
		
		

		
	}

	

}
