package com.shrajan.creational.abstractfactory;

public class PVCDoor extends Door {
	
	private String doorType;

	public PVCDoor(String doorType) {
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
		System.out.println(doorType+" Locking =>>");
		return true;
	}

	@Override
	boolean unlockDoor() {
		System.out.println(doorType+" UnLocking =>>");
		return true;
	}

}
