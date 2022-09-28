package com.automatedapp.bean;

public class Buyer {

	private int bId;
	private String bName;
	private String bEmail;

	public Buyer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Buyer(int bId, String bName, String bEmail) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bEmail = bEmail;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbEmail() {
		return bEmail;
	}

	public void setbEmail(String bEmail) {
		this.bEmail = bEmail;
	}

	@Override
	public String toString() {
		return "Buyer [bId=" + bId + ", bName=" + bName + ", bEmail=" + bEmail + "]";
	}

}
