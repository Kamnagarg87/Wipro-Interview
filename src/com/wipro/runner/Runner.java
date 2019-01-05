package com.wipro.runner;

import java.util.HashMap;
import java.util.Map;

import com.wipro.user.User;
import com.wipro.stock.Stock;

public class Runner {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("APPLE", 20);
		map.put("SHWAB", 30);
		map.put("AMZN", 25);
		Stock stock = new Stock(map);

		User userA = new User(stock, "APPLE", "A");
		User userB = new User(stock, "SHWAB", "B");
		User userC = new User(stock, "AMZN", "C");

		userA.buyStock(2);
		userB.buyStock(6);
		userC.buyStock(7);
		userB.sellStock(3);

		printTotalStockInInventory(stock);

		printUserStockCount(userA);
		printUserStockCount(userB);
		printUserStockCount(userC);

	}

	private static void printUserStockCount(User user) {
		user.printUserStockInformation();

	}

	private static void printTotalStockInInventory(Stock stock) {
		stock.printStockInInventory();

	}

}
