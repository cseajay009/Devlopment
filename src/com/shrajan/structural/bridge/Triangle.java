package com.shrajan.structural.bridge;

public class Triangle extends Shape {

	public Triangle(Color col, String type) {
		super(col, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Shape draw(Color col) {
		// TODO Auto-generated method stub
		return new Triangle(col,ShapeTypes.Triangle);
	}
	
	public String getType() {
		return this.shapeType;
	}

}
