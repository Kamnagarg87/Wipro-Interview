package com.wipro.stock;

import java.util.Map;
import java.util.Map.Entry;

public class Stock {
	public Map<String, Integer> map;

	public Stock(Map<String, Integer> map) {
		this.map = map;
	}

	public Map<String, Integer> getStocksInInventory() {
		return map;
	}

	public int setTransaction(String stockName, int count, boolean isBuy) {
		int temp = -1;
		if (!map.containsKey(stockName)) {
			System.out.println("Error, Stock does not exists");
			return -1;
		}
		int currentCount = map.get(stockName);
		if (isBuy) {
			if (currentCount < count) {
				System.out.println("Error, insufficent number for stock");
				return -1;
			}
			temp = currentCount - count;
			map.put(stockName, temp);
		} else {
			temp = currentCount + count;
			map.put(stockName, currentCount + count);
		}
		return temp;
	}

	public void printStockInInventory() {
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Stock : " + entry.getKey() + " has current count = " + entry.getValue());

		}

	}

}