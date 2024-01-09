package com.shrajan.creational.abstractfactory;

public class DoorFactory {

	public static Door createDoor(DoorAbstractFactory factory) {
		return factory.createDoor();
	}
}
