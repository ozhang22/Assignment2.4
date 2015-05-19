package com.google.gwt.sample.stockwatcher.client;

import java.io.Serializable;

public class StockPrice implements Serializable {

	
	//Fields for StockPrices
	private static final long serialVersionUID = 1L;
	private String symbol;
	private double price;
	private double change;
	private double newField;

	// This is a constructor
	public StockPrice() {
	}

	public StockPrice(String symbol, double price, double change) {
		this.symbol = symbol;
		this.price = price;
		this.change = change;
		newField = 0;
	}

	public double getPrice() {
		return this.price;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public double getChange() {
		return this.change;
	}

	public double getChangePercent() {
		return 100.0 * this.change / this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setSymbol(String symbol) {
		System.out.println("Hello");
		this.symbol = symbol;
		this.newField = 100;
	}

	public void setChange(double change) {
		this.change = change;
	}
}
