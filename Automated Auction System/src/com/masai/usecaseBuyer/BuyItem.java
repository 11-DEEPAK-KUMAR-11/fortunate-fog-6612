package com.masai.usecaseBuyer;

import java.util.Scanner;

import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImp;

public class BuyItem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Buyer Id :");
		int bid=sc.nextInt();
		
		
		System.out.println("Enter Product Quantity :");
		int qnt=sc.nextInt();
		
		System.out.println("Enter Product Price :");
		int price=sc.nextInt();
		
		System.out.println("Enter Product Name :");
		String pname=sc.next();
		
		System.out.println("Enter Date in YYYY-MM-DD :");
		String odate=sc.next();
		
		BuyerDao buy=new BuyerDaoImp();
		String result=buy.selectItemsTOBuy(bid, qnt, price, pname, odate);
		
		System.out.println(result);
		
		

	}

}
