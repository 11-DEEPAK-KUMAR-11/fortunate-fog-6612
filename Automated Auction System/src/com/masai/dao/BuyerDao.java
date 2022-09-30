package com.masai.dao;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Buyer;
import com.masai.bean.Seller;
import com.masai.exception.AdminException;
import com.masai.exception.BuyerException;
import com.masai.exception.SellerException;

public interface BuyerDao {

    public String registerBuyer(String name,String email,String passwrod);
	
	public Buyer loginBuyer(String username, String password)throws BuyerException;
	
//	public Items getItemByCategory(String name)throws BuyerException;
	
	public List<Seller> getAllSellerDetails()throws SellerException;
	
//	public Items selectItemsTOBuy(int itemId);
	
	

}
