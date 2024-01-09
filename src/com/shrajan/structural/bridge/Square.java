package com.shrajan.structural.bridge;

public class Square extends Shape {

	public Square(Color col, String shapeType) {
		super(col,shapeType);
	
	}

	@Override
	public Shape draw(Color col) {
		
		return new Square(col,ShapeTypes.Square);
	}

	public String getType() {
		return this.shapeType;
	}
}
