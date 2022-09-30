package com.masai.usecase;

import java.util.List;

import com.masai.bean.Seller;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImp;
import com.masai.dao.SellerDao;
import com.masai.exception.SellerException;

public class ViewAllSeller {

	public static void main(String[] args) {



		AdminDao dao = new AdminDaoImp();
		
		try {
		List<Seller> sellerDetails= dao.getAllSellerDetails();
		
		sellerDetails.forEach(s ->{
			
			System.out.println("Student Name :"+s.getSid());
			System.out.println("Student email: "+s.getSname());
			System.out.println("Student email: "+s.getSemail());
			
			System.out.println("=======================");
		});
		
		
		
		
		}catch(SellerException se) {
			System.out.println(se.getMessage());
		}
		
		

	}

}
