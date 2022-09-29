package com.masai.bean;

public class Seller {

	private String sname;
	private String semail;
	private String spassword;
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seller(String sname, String semail, String spassword) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.spassword = spassword;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	@Override
	public String toString() {
		return "Seller [sname=" + sname + ", semail=" + semail + ", spassword=" + spassword + "]";
	}
	
	
	
}
