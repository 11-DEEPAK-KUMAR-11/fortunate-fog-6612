package com.masai.bean;

public class Seller {

	private int sid;
	private String sname;
	private String semail;
	private String spassword;
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Seller(int sid,String sname,String semail) {
		
		super();

		this.sid=sid;
		this.sname=sname;
		this.semail=semail;	
	}
	
	public Seller(String sname, String semail, String spassword) {
		super();
		
		this.sname = sname;
		this.semail = semail;
		this.spassword = spassword;
	}
	
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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
