package com.masai.bean;

public class Buyer {

	private int bid;
	private String bname;
	private String bemail;
	private String bpassword;
	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    public Buyer(int bid,String bname,String bemail) {
		
		super();

		this.bid=bid;
		this.bname=bname;
		this.bemail=bemail;	
	}
	
	public Buyer(String bname, String bemail, String bpassword) {
		super();
		this.bname = bname;
		this.bemail = bemail;
		this.bpassword = bpassword;
	}
	
	
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBemail() {
		return bemail;
	}
	public void setBemail(String bemail) {
		this.bemail = bemail;
	}
	public String getBpassword() {
		return bpassword;
	}
	public void setBpassword(String bpassword) {
		this.bpassword = bpassword;
	}
	@Override
	public String toString() {
		return "Buyer [bname=" + bname + ", bemail=" + bemail + ", bpassword=" + bpassword + "]";
	}
	
	
}
