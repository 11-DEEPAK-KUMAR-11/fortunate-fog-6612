package com.masai.usecaseSeller;

import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImp;

public class DeleteItem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Item Id :");
		int itemId=sc.nextInt();
		
		SellerDao delete=new SellerDaoImp();
		
		String result=delete.deleteItems(itemId);
		System.out.println(result);
		

	}

}
