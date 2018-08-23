package com.yash.shoppingcart;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.yash.shoppingcart.domain.Cart;
import com.yash.shoppingcart.domain.Quote;

public class StartupApp {

	public static void main(String[] args) {
		
		Quote quote1 = new Quote("Tractors", Date.valueOf("2010-08-30"), 500, 400);
		Quote quote2 = new Quote("Combines", Date.valueOf("2010-08-30"), 500, 400);
		Quote quote3 = new Quote("Tillage", Date.valueOf("2010-08-30"), 500, 400);
		
		List<Quote> quotes = new ArrayList<>();
		quotes.add(quote1);
		quotes.add(quote2);
		
		Cart cart1 = new Cart("Cart 1", Date.valueOf("2018-08-30"), quotes);
		System.out.println("Cart 1 has : ");
		System.out.println(cart1);
		
		//using iterator
		System.out.println("\n using iterator : ");
		Iterator<Quote> quoteIterator = quotes.iterator();
		while (quoteIterator.hasNext()) {
			Quote quote = (Quote) quoteIterator.next();
			System.out.println(quote);
		}
		
		//Collection stream() util : Returns a sequential Stream with this collection as it's source
		System.out.println("\n using collection stream util : ");
		quotes.forEach((quote)->{
			System.out.println(quote);
		});
		
		
	}
}
