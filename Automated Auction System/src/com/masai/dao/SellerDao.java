package com.masai.dao;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.bean.Items;
import com.masai.bean.Seller;
import com.masai.exception.BuyerException;
import com.masai.exception.SellerException;

public interface SellerDao {

    public String registerSeller(String name,String email,String passwrod);
	
	public Buyer loginSeller(String username, String password)throws BuyerException;
	
	public Items createItemList(String name)throws SellerException;
	
	public Items updateItemList(String name)throws SellerException;
	
	public Items deleteeItemList(String name)throws SellerException;
	
//	public List<Order> getAllOrderDetails()throws SellerException;
	

	
}
