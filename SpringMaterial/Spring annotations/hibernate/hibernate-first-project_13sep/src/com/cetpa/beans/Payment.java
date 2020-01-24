package com.cetpa.beans;

public abstract class Payment 
{
	// data members
	private int id;
	private String productName;
	private int productCost;

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCost() {
		return productCost;
	}

	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}

	// no arg cnst
	public Payment() {
	}

	// param cnst
	public Payment(int id, String productName, int productCost) {
		super();
		this.id = id;
		this.productName = productName;
		this.productCost = productCost;
	}
	
	
}