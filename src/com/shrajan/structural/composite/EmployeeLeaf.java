package com.shrajan.structural.composite;

public class EmployeeLeaf implements Component {
	

	private int points;
	
	public EmployeeLeaf(int pnts) {
		this.points = pnts;
		
	}
	
	

	@Override
	public int getTotalPoints() {
		
		return this.points;
	}
}
