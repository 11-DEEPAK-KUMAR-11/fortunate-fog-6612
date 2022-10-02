package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImp;

public class ViewDisputesOnDailyBasis {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date YYYY-MM-DD Format :");
		String d=sc.next();
		
		AdminDao dao=new AdminDaoImp();
		dao.getAllDisputesDetailsDailyBasis(d);

	}

}
