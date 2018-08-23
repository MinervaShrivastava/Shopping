package com.yash.shoppingcart.domain;

import java.sql.Date;

public class Quote {
	
	private String name;
	private Date manufaturingYear;
	private double listPrice;
	private double costPrice;
	
	public Quote(String name, Date manufaturingYear, double listPrice, double costPrice) {
		super();
		this.name = name;
		this.manufaturingYear = manufaturingYear;
		this.listPrice = listPrice;
		this.costPrice = costPrice;
	}

	public Quote() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getManufaturingYear() {
		return manufaturingYear;
	}

	public void setManufaturingYear(Date manufaturingYear) {
		this.manufaturingYear = manufaturingYear;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	@Override
	public String toString() {
		return "\n Quote [name=" + name + ", manufaturingYear=" + manufaturingYear + ", listPrice=" + listPrice
				+ ", costPrice=" + costPrice + "]";
	}
	
}
