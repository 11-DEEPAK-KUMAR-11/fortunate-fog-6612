package com.masai.dao;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Buyer;
import com.masai.bean.Items;
import com.masai.bean.Seller;
import com.masai.exception.AdminException;
import com.masai.exception.BuyerException;
import com.masai.exception.ItemException;
import com.masai.exception.SellerException;

public interface BuyerDao {

    public String registerBuyer(String name,String email,String passwrod);
	
	public Buyer loginBuyer(String username, String password)throws BuyerException;
	
	public List<Items> getItemByCategory(String name)throws ItemException;
	
	public void getAllItemsWithSellerDetails()throws SellerException;
	
	public String selectItemsTOBuy(int bid, int qnt, int price, String pname, String date);
	
	

}
