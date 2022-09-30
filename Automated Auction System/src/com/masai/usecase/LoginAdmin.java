package com.masai.usecase;

import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImp;
import com.masai.exception.AdminException;

public class LoginAdmin {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Username:");
		String uname = sc.next();
		
		System.out.println("Enter Password:");
		String pass = sc.next();
		
		AdminDao dao = new AdminDaoImp();
		
		try {
			Admin admin= dao.loginStudent(uname, pass);
		
	 		System.out.println("Welcome Admin :"+admin.getName());
	 	
	 	
		}catch (AdminException e) {
			System.out.println(e.getMessage());
		}
	}

}
