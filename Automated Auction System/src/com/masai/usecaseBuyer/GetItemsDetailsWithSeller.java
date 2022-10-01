package com.masai.usecaseBuyer;

import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImp;
import com.masai.exception.SellerException;

public class GetItemsDetailsWithSeller {

	public static void main(String[] args) {
		
		BuyerDao get=new BuyerDaoImp();
		try {
			get.getAllItemsWithSellerDetails();
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
