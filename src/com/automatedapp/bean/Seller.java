package com.automatedapp.bean;

public class Seller {

	private int sId;
	private String sName;
	private String sEmail;

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(int sId, String sName, String sEmail) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmail = sEmail;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	@Override
	public String toString() {
		return "Seller [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + "]";
	}

}
