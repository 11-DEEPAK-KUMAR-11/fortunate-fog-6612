package com.masai.bean;

public class Items {
 
	private int itemId;
	private String category;
	private int price;
	private String Pname;
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Items(  String pname,int price,String category) {
		super();
		this.category = category;
		this.price = price;
		Pname = pname;
	}
	
	public Items(int itemId, String category, int price, String pname) {
		super();
		this.itemId = itemId;
		this.category = category;
		this.price = price;
		Pname = pname;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", category=" + category + ", price=" + price + ", Pname=" + Pname + "]";
	}
	
	
	
}
