package com.shrajan.structural.adapter;

public class Client {

	public static void main(String[] args) {
		
		Adapter adapter =  new Adapter();
		String report = adapter.generateReport();
        System.out.println(report);
	}

}
