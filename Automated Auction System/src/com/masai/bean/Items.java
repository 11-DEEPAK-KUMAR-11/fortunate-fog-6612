package com.masai.bean;

public class Items {
 
	private String category;
	private int price;
	private String AvlQuantity;
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(String category, int price, String avlQuantity) {
		super();
		this.category = category;
		this.price = price;
		AvlQuantity = avlQuantity;
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
	public String getAvlQuantity() {
		return AvlQuantity;
	}
	public void setAvlQuantity(String avlQuantity) {
		AvlQuantity = avlQuantity;
	}
	@Override
	public String toString() {
		return "Items [category=" + category + ", price=" + price + ", AvlQuantity=" + AvlQuantity + "]";
	}
	
	
}
