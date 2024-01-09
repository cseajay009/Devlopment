package com.shrajan.creational.factory;

public class ClientCode {

	public static void main(String[] args) {
		
		
		
	    CarFactory carfactory =  new CarFactory();
	    
		Vehicle car = carfactory.createVehicle();
		
		
		MotorCycleFactory motorCycleFactory = new MotorCycleFactory();
		
		Vehicle motorCycle =  motorCycleFactory.createVehicle();

		
		System.out.println(car.getClass());
		
		
		System.out.println(motorCycle.getClass());
		
	}

}
