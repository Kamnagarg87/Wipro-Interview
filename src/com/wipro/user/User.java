package com.wipro.user;

import com.wipro.stock.Stock;

public class User {
	int stockCount;
	String stockName;
	Stock stock;
	String userName;

	public User(Stock stock, String stockName, String userName) {
		this.stock = stock;
		this.stockName = stockName;
		this.userName = userName;
	}

	public void buyStock(int count) {
		stock.setTransaction(stockName, count, true);
		stockCount += count;
	}

	public void sellStock(int count) {
		stock.setTransaction(stockName, count, false);
		stockCount -= count;
	}

	public int getStockCount() {
		return stockCount;
	}

	public String getStockName() {
		return stockName;
	}

	public String getUserName() {
		return userName;
	}

	public void printUserStockInformation() {
		System.out.println("User: " + userName + " has stock " + getStockName() + " count = " + getStockCount());
	}

}