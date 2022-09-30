package com.masai.usecaseSeller;

import java.util.Scanner;

import com.masai.bean.Seller;
import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImp;
import com.masai.exception.SellerException;



public class LoginSeller {

	public static void main(String[] args) {



		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		SellerDao dao = new SellerDaoImp();
		
		try {
			Seller s= dao.loginSeller(uname, pass);
		
	 		System.out.println("Welcome Seller :"+s.getSname());
	 	
	 	
		}catch (SellerException e) {
			System.out.println(e.getMessage());
		}

	}

}
