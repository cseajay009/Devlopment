package com.shrajan.structural.flyweight;

import java.util.HashMap;

public class CurrencyFlyweight {

	
	private HashMap<String, Currency> currencies;
	
	public CurrencyFlyweight() {
		currencies =  new HashMap<String,Currency>();
	}
	
	
	public Currency getCurrency(String curr) {
		
		if(!currencies.containsKey(curr)) {
			currencies.put(curr, new ConcreateCurrency());
		}
		
		return currencies.get(curr);
	}
	
}
