package com.test.rover;

public class MovingNorth extends RoverDirection {

	public MovingNorth(Rover rover) {
		super(rover);
	}

	@Override
	public void Move() {
		Coordinates currentPosition = rover.getPosition();
		currentPosition.setYCoordinate(currentPosition.getYCoordinate()+1);
		rover.setPosition(currentPosition);
	}

	@Override
	public void TurnLeft() {
		rover.setDirection(new MovingWest(rover));

	}

	@Override
	public void TurnRight() {
		rover.setDirection(new MovingEast(rover));

	}

	@Override
	public String toString() {
		return "N";
	}
	
}
