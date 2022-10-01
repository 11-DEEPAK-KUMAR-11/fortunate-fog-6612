package com.masai.usecaseSeller;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImp;
import com.masai.exception.SellerException;

public class ViewSoldHistory {

	public static void main(String[] args) {
		
		SellerDao soldHistory=new SellerDaoImp();
		try {
			soldHistory.getAllOrderDetails();
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
