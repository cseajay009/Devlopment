package com.shrajan.creational.singleton;

public class SingleTonTest {

	public static void main(String[] args) {
		SingleTon instannceOne = SingleTon.getInstance();

		SingleTon instanceTwo = SingleTon.getInstance();
		
		System.out.println(instannceOne.equals(instanceTwo));
	}

}
