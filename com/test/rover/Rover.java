package com.test.rover;

public class Rover {

	private Coordinates position;
	private char headingTowards;
	private RoverDirection direction;
	private Plateau plateau;
	
	
	public Rover(Coordinates position, char headingTowards, Plateau plateau) {
		this.position = position;
		this.headingTowards = headingTowards;
		this.direction = DirectionFactory.getRoverDirection(headingTowards, this) ;
		this.plateau = plateau;
	}

	public char getHeadingTowards() {
		return headingTowards;
	}

	public void setHeadingTowards(char headingTowards) {
		this.headingTowards = headingTowards;
	}

	public Coordinates getPosition() {
		return position;
	}

	public void setPosition(Coordinates position) {
		boolean isValidPosition = plateau.isValidPosition(position);
		if(isValidPosition)
		{
			this.position = position;
		}else
		{
			System.out.println("Position is beyond the Plateau boundary");
			System.exit(0);
		}
	}

	
	public RoverDirection getDirection() {
		return direction;
	}

	public void setDirection(RoverDirection direction) {
		this.direction = direction;
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}

	public String getCurrentPosition()
	{
		return "Current position of Rover is: "+position.getXCoordinate()+","+position.getYCoordinate()+","+direction.toString();
	}
	
	public  void move(String instruction)
	{
		for(int i=0;i<instruction.length();i++)
		{
			if(instruction.charAt(i)=='L')
			{
				direction.TurnLeft();
			}
			if(instruction.charAt(i)=='R')
			{
				direction.TurnRight();
			}
			if(instruction.charAt(i)=='M')
			{
				direction.Move();
			}
			
		}
	}
}
