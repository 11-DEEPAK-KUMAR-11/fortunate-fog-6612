package com.masai.dao;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.exception.AdminException;
import com.masai.exception.BuyerException;
import com.masai.exception.SellerException;

public interface AdminDao {

	public String registerAdmin(String name,String email,String passwrod);
	
	public Admin loginStudent(String username, String password)throws AdminException;
	
	public List<Seller> getAllSellerDetails()throws SellerException;
	
	public List<Buyer> getAllBuyerDetails()throws BuyerException;
	
	public void getAllOrderDetailsDailyBasis(String date);
	
	public void getAllDisputesDetailsDailyBasis(String date);
	
	public String resolveDispute(int orderId , String updateDispute);
	
	


	
}
