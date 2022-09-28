package com.automatedapp.bean;

public class Administrator {
	private int aID;
	private String aName;
	private String aEmail;
	private String aPassword;

	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrator(int aID, String aName, String aEmail, String aPassword) {
		super();
		this.aID = aID;
		this.aName = aName;
		this.aEmail = aEmail;
		this.aPassword = aPassword;
	}

	public int getaID() {
		return aID;
	}

	public void setaID(int aID) {
		this.aID = aID;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaEmail() {
		return aEmail;
	}

	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	public String getaPassword() {
		return aPassword;
	}

	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}

	@Override
	public String toString() {
		return "Administrator [aID=" + aID + ", aName=" + aName + ", aEmail=" + aEmail + ", aPassword=" + aPassword
				+ "]";
	}

}
