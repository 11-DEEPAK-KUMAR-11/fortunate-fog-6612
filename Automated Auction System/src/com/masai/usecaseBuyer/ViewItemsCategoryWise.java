package com.masai.usecaseBuyer;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Items;
import com.masai.dao.BuyerDao;
import com.masai.dao.BuyerDaoImp;
import com.masai.exception.ItemException;

public class ViewItemsCategoryWise {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter Category Name :");
		String category=sc.next();
		
		BuyerDao search=new BuyerDaoImp();
		
		try {
			
			List<Items> itemList=search.getItemByCategory(category);
			
			itemList.forEach(s ->{
				
				System.out.println("Product Category :"+s.getCategory());
				System.out.println("Product Name : "+s.getPname());
				System.out.println("Product Price : "+s.getPrice());
				
				System.out.println("=======================");
			});
			
		} catch (ItemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
