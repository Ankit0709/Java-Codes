package com.cetpa.beans;

public class PaymentByCheque extends Payment
{
	// data members
	private String chNumber;

	// getters and setters
	public String getChNumber() {
		return chNumber;
	}

	public void setChNumber(String chNumber) {
		this.chNumber = chNumber;
	}
	
	// no arg cnst
	public PaymentByCheque() {
		// TODO Auto-generated constructor stub
	}

	// param cnst
	public PaymentByCheque(String chNumber) {
		super();
		this.chNumber = chNumber;
	}
	
	 

}
