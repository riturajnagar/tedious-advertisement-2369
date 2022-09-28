package com.automatedapp.bean;

public class Seller {

	private int sId;
	private String sName;
	private String sEmail;
	private String sPassword;

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(int sId, String sName, String sEmail, String sPassword) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sEmail = sEmail;
		this.sPassword = sPassword;
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

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	@Override
	public String toString() {
		return "Seller [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + ", sPassword=" + sPassword + "]";
	}

}
