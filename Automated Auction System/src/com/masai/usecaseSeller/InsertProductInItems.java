package com.masai.usecaseSeller;

import java.util.Scanner;

import com.masai.dao.SellerDao;
import com.masai.dao.SellerDaoImp;
import com.masai.exception.ItemException;

public class InsertProductInItems {

	public static void main(String[] args) {



		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Product Name :");
		String Pname= sc.next();
		
		System.out.println("Enter Price :");
		int price= sc.nextInt();
		
		System.out.println("Enter Category :");
		String cat= sc.next();
		
		System.out.println("Enter Item Id :");
		int itemId= sc.nextInt();
		
		SellerDao insert=new SellerDaoImp();
		String result=insert.insertItems(Pname, price, cat, itemId);
		
		System.out.println(result);
		

	}

}
