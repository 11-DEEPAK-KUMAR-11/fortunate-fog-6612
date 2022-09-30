package com.masai.usecaseBuyer;

import java.util.Scanner;

import com.masai.bean.Buyer;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImp;
import com.masai.exception.BuyerException;



public class LoginBuyer {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		BuyerDao dao = new BuyerDaoImp();
		
		try {
			Buyer b= dao.loginBuyer(uname, pass);
		
	 		System.out.println("Welcome Buyer :"+b.getBname());
	 	
	 	
		}catch (BuyerException e) {
			System.out.println(e.getMessage());
		}

	}

}
