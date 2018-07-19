package com.test.rover;

public class Plateau {

	private Coordinates minCoordinates;
	private Coordinates maxCoordinates;
	
	
	public Plateau(Coordinates minCoordinates, Coordinates maxCoordinates) {
		this.minCoordinates = minCoordinates;
		this.maxCoordinates = maxCoordinates;
	}
	public Coordinates getMaxCoordinates() {
		return maxCoordinates;
	}
	public void setMaxCoordinates(Coordinates maxCoordinates) {
		this.maxCoordinates = maxCoordinates;
	}
	public Coordinates getMinCoordinates() {
		return minCoordinates;
	}
	public void setMinCoordinates(Coordinates minCoordinates) {
		this.minCoordinates = minCoordinates;
	}
	private boolean isCoordinateXOnPlateau(int x)
	{ 
		return x >= minCoordinates.getXCoordinate() && x <= maxCoordinates.getXCoordinate(); 
	}
	private boolean isCoordinateYOnPlateau(int y)  
	{
	   return y >= minCoordinates.getYCoordinate() && y <= maxCoordinates.getYCoordinate(); 
	}
	
	public boolean isValidPosition(Coordinates coordinates)
	{
		if(!isCooridnatesOnPlateau(coordinates.getXCoordinate(),coordinates.getYCoordinate()))
		{
			return false;
		}
		return true;
	}
	private boolean isCooridnatesOnPlateau(int x, int y) 
	{
	 return (isCoordinateXOnPlateau(x) && isCoordinateYOnPlateau(y)); 
	}
}
