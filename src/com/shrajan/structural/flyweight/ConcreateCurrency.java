package com.shrajan.structural.flyweight;

public class ConcreateCurrency implements Currency {

	@Override
	public double convert(double amount, double exchangeRate) {
		// TODO Auto-generated method stub
		return amount*exchangeRate;
	}
	
	
	

}
