package com.gigamon;

public class Address {
	private int dno;
	private String streetName;
	public Address(int dno, String streetName) {
		super();
		this.dno = dno;
		this.streetName = streetName;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
}
