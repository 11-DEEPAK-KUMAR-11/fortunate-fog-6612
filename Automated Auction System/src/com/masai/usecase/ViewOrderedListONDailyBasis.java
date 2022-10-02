package com.masai.usecase;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImp;

public class ViewOrderedListONDailyBasis {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date YYYY-MM-DD Format :");
		String d=sc.next();
		
		AdminDao dao=new AdminDaoImp();
		dao.getAllOrderDetailsDailyBasis(d);

	}

}
