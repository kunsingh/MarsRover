package com.test.rover;

public class Coordinates {

	private int xCoordinate;
	private int yCoordinate;
	
	
	public Coordinates(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	public int getXCoordinate() {
		return xCoordinate;
	}
	public void setXCoordinate(int coordinate) {
		xCoordinate = coordinate;
	}
	public int getYCoordinate() {
		return yCoordinate;
	}
	public void setYCoordinate(int coordinate) {
		yCoordinate = coordinate;
	}
	
}
