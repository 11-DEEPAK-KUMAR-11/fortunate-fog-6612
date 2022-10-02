package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImp;

public class ResolveDisputes {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Order Id :");
		int oid=sc.nextInt();
		
		System.out.println("Change Status to :");
		String resolve=sc.next();
		
		AdminDao dao=new AdminDaoImp();
		
		String r=dao.resolveDispute(1,resolve);
		System.out.println(r);

	}

}
