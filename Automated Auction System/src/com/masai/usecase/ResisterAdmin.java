package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImp;

public class ResisterAdmin {

	
        public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Admin Name:");
		String sname= sc.next();
		
		
		System.out.println("Enter Admin Email:");
		String email= sc.next();
		
		System.out.println("Enter Admin password:");
		String password= sc.next();
		
		
		AdminDao dao=new AdminDaoImp();
		
		//AdminDaoImpl dao = new AdminDaoImpl();
		
		String result= dao.registerAdmin(sname, email, password);
		
		System.out.println(result);
	}
}
