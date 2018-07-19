package com.test.rover;

public class MovingEast extends RoverDirection {

	public MovingEast(Rover rover) {
		super(rover);
	}

	@Override
	public void Move() {
		Coordinates currentPosition = rover.getPosition();
		currentPosition.setXCoordinate(currentPosition.getXCoordinate()+1);
		rover.setPosition(currentPosition);
	}

	@Override
	public void TurnLeft() {
		rover.setDirection(new MovingNorth(rover));

	}

	@Override
	public void TurnRight() {
		rover.setDirection(new MovingSouth(rover));

	}

	@Override
	public String toString() {
		return "E";
	}
	
	

}
