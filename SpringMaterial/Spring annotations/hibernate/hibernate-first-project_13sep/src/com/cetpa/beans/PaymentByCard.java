package com.cetpa.beans;

public class PaymentByCard extends Payment
{
	// data members
	private String number, cvv;

	// getters and setters
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	// no arg cnst
	public PaymentByCard() {
	}

	// param cnst
	public PaymentByCard(String number, String cvv) {
		super();
		this.number = number;
		this.cvv = cvv;
	}
	
	
	
}
