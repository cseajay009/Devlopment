package com.shrajan.structural.bridge;

public abstract class Shape {

	public Color color;
	public String shapeType;
	
	public Shape(Color col, String shapeType) {
		this.color = col;
		this.shapeType = shapeType;
	}
	public abstract Shape draw(Color col);
}
