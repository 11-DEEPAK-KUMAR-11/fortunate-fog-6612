package com.masai.usecaseBuyer;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImp;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImp;

public class ResisterBuyer {

	 public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Buyer Name:");
			String sname= sc.next();
			
			
			System.out.println("Enter Buyer Email:");
			String email= sc.next();
			
			System.out.println("Enter Buyer password:");
			String password= sc.next();
			
			
			BuyerDao dao=new BuyerDaoImp();
			
			//AdminDaoImpl dao = new AdminDaoImpl();
			
		    String result=dao.registerBuyer(sname, email, password);
		    
		    System.out.println(result);
		    		
		}

}
