package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.exception.AdminException;
import com.masai.exception.BuyerException;
import com.masai.exception.SellerException;
import com.masai.utility.DBUtil;

public class AdminDaoImp implements AdminDao {

	@Override
	public String registerAdmin(String name, String email, String password) {
		
        String message = "Not Inserted..";
	
		
	
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into admin(aname,aemail,apassword) values(?,?,?)");
			
			
			
			ps.setString(1, name);
			
			ps.setString(2, email);
			ps.setString(3, password);
			
			int x= ps.executeUpdate();
			
			
			if(x > 0)
				message = "Admin Registered Sucessfully !";
			
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
	
	
		
		return message;
		
	}

	@Override
	public Admin loginStudent(String username, String password) throws AdminException {
		
       Admin ad = null;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			
			PreparedStatement ps= conn.prepareStatement("select * from admin where aemail = ? AND apassword = ?");			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			
				if(rs.next()) {
				

				String n= rs.getString("aname");
				
				String e= rs.getString("aemail");
				String p= rs.getString("apassword");
				
				
			    ad=new Admin( n, e, p);	
				
				
			}else
				throw new AdminException("Invalid Username or password.. ");
			
			
			
			
		} catch (SQLException e) {
			throw new AdminException(e.getMessage());
		}
		
		
		return ad;
		
		
	}

	@Override
	public List<Seller> getAllSellerDetails() throws SellerException {



		List<Seller> sellerList= new ArrayList<>();
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from seller");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				int r= rs.getInt("sid");
				String n= rs.getString("sname");
				
				String e= rs.getString("semail");
				
				
				
			Seller s=new Seller(r, n, e);	
				
			sellerList.add(s);
				
				
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			throw new SellerException(e.getMessage());
		}
		
		
		if(sellerList.size() == 0)
			throw new SellerException("No Seller data found..");
		
		
		
		
		return sellerList;
	}

	@Override
	public List<Buyer> getAllBuyerDetails() throws BuyerException {

		List<Buyer> buyerList= new ArrayList<>();
		
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from buyer");
			
			
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				
				int r= rs.getInt("bid");
				String n= rs.getString("bname");
				
				String e= rs.getString("bemail");
				
				
				
			Buyer s=new Buyer(r, n, e);	
				
			buyerList.add(s);
				
				
				
			}
		
		} catch (SQLException e) {
			throw new BuyerException(e.getMessage());
		}
		
		
		if(buyerList.size() == 0)
			throw new BuyerException("No Buyer data found..");
		
		
		
		
		return buyerList;
	}

	
	// Ordered List on Daily Basis
	@Override
	public void getAllOrderDetailsDailyBasis(String datewise) {

 
		    try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from purchase where orderDate=?");
			
			ps.setString(1, datewise);
			ResultSet rs= ps.executeQuery();
			
			boolean flag= true;
			
			while(rs.next()) {
			
				flag = false;
				int od= rs.getInt("orderid");
				int bid= rs.getInt("bid");
				int qnt= rs.getInt("quant");
				int total= rs.getInt("amount");
				String pro= rs.getString("product");
				String date= rs.getString("orderDate");
				String st= rs.getString("status");
				
				System.out.println("Order Id :"+od);
				System.out.println("Buyer Id :"+bid);
				System.out.println("Product Quantity :"+qnt);
				System.out.println("Total Amount :"+total);
				System.out.println("Product Name :"+pro);
				System.out.println("Ordered Date :"+date);
				System.out.println("Product Status :"+st);
				
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

	@Override
	public void getAllDisputesDetailsDailyBasis(String daily) {


 
		    try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from disputes where Date=?");
			
			ps.setString(1, daily);
			ResultSet rs= ps.executeQuery();
			
			boolean flag= true;
			
			while(rs.next()) {
			
				flag = false;
				int od= rs.getInt("oid");
				int bid= rs.getInt("bid");
				String date= rs.getString("Date");
				String st= rs.getString("dstatus");
				
				System.out.println("Order Id :"+od);
				System.out.println("Buyer Id :"+bid);
				System.out.println("Ordered Date :"+date);
				System.out.println("Product Status :"+st);
				
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
