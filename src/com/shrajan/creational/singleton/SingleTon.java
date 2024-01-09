package com.shrajan.creational.singleton;

public class SingleTon {

	
	private static SingleTon instance;
	
	
	private SingleTon() {
		
	}
	
	
	public static SingleTon getInstance() {
		synchronized(SingleTon.class) {if(instance==null) {
			instance = new SingleTon();
		}}
		
		
		
		return instance;
	}
	
	
	
	
	
}
