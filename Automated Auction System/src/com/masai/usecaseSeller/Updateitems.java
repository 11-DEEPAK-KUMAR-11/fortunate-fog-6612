package com.masai.usecaseSeller;

import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImp;

public class Updateitems {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Product name :");
		String pname= sc.next();
		
		System.out.println("Enter the Price :");
		int price= sc.nextInt();
		
		System.out.println("Enter the Category name :");
		String category= sc.next();
		
		System.out.println("Enter the ItemId :");
		int itemId= sc.nextInt();
		
		SellerDao update=new SellerDaoImp();
		
		String result=update.updateItemList(pname, price, category, itemId);
		System.out.println(result);
		
		
		
		

	}

}
