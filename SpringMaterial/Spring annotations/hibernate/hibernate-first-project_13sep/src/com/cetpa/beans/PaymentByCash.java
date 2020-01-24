package com.cetpa.beans;

public class PaymentByCash extends Payment 
{
	// data members
	private String deno;

	// getters and setters
	public String getDeno() {
		return deno;
	}

	public void setDeno(String deno) {
		this.deno = deno;
	}

	// no arg cnst
	public PaymentByCash() {
	}
	
	// param cnst
	public PaymentByCash(String deno) {
		super();
		this.deno = deno;
	}
}
