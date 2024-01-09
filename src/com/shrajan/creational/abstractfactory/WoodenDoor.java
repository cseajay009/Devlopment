package com.shrajan.creational.abstractfactory;

public class WoodenDoor extends Door {
	
	private String doorType;

	public WoodenDoor(String doorType) {
		super();
		this.doorType = doorType;
	}

	@Override
	boolean openDoor() {
		System.out.println(doorType+" Opening =>>");
		return true;
	}

	@Override
	boolean closeDoor() {
		System.out.println(doorType+" Closing =>>");
		return true;
	}

	@Override
	boolean lockDoor() {
		System.out.println(doorType+" locking =>>");
		return true;
	}

	@Override
	boolean unlockDoor() {
		System.out.println(doorType+" Unlocking =>>");
		return true;
	}

}
