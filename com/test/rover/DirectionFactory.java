package com.test.rover;


public class DirectionFactory {
	
	
	public static RoverDirection getRoverDirection(char key, Rover rover)
	{
		RoverDirection roverDirection=null;
		if(key=='N'||key=='n')
		{
			roverDirection = new MovingNorth(rover);
		}else if(key=='E'||key=='e')
		{
			roverDirection = new MovingEast(rover);
		}else if(key=='S'||key=='s')
		{
			roverDirection = new MovingSouth(rover);
		}else if(key=='W'||key=='w')
		{
			roverDirection = new MovingWest(rover);
		}
		
		return roverDirection;
	}
}
