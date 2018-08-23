package com.yash.shoppingcart.domain;

import java.sql.Date;
import java.util.List;

public class Cart {

	private String name;
	private Date dateOfCreation;
	private List<Quote> Quotes;
	
	public Cart(String name, Date dateOfCreation, List<Quote> quotes) {
		super();
		this.name = name;
		this.dateOfCreation = dateOfCreation;
		Quotes = quotes;
	}
	
	public Cart() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public List<Quote> getQuotes() {
		return Quotes;
	}

	public void setQuotes(List<Quote> quotes) {
		Quotes = quotes;
	}

	@Override
	public String toString() {
		return "Cart [name=" + name + ", dateOfCreation=" + dateOfCreation + ", Quotes=" + Quotes + "]";
	}
	
}
