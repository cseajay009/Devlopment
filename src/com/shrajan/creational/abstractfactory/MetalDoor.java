package com.shrajan.creational.abstractfactory;

public class MetalDoor extends Door {
	
	private String doorType;

	public MetalDoor(String doorType) {
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
		System.out.println(doorType+" Locked =>>");
		return true;
	}

	@Override
	boolean unlockDoor() {
		System.out.println(doorType+" UnLocked =>>");
		return true;
	}

}
