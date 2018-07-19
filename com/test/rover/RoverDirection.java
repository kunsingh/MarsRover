package com.test.rover;

public abstract class RoverDirection {

	protected Rover rover;

	public RoverDirection(Rover rover) {
		this.rover = rover;
	}
	
	public abstract void TurnRight();
	public abstract void TurnLeft();
	public abstract void Move();
}
