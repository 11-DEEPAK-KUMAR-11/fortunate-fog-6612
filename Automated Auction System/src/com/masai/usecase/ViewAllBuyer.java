package com.masai.usecase;

import java.util.List;

import com.masai.bean.Buyer;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImp;
import com.masai.exception.BuyerException;


public class ViewAllBuyer {

	public static void main(String[] args) {



		AdminDao dao = new AdminDaoImp();
		
		try {
		List<Buyer> buyerDetails= dao.getAllBuyerDetails();
		
		buyerDetails.forEach(s ->{
			
			System.out.println("Buyer id :"+s.getBid());
			System.out.println("Buyer Name: "+s.getBname());
			System.out.println("Buyer email: "+s.getBemail());
			
			System.out.println("=======================");
		});
		
		
		
		
		}catch(BuyerException se) {
			System.out.println(se.getMessage());
		}

	}

}
