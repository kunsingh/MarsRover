package com.test.rover;

public class TestMarsRover {

	public static void main(String[] args) {
		
		Plateau plateau = new Plateau(new Coordinates(0,0),new Coordinates(5,5));
		Rover rover = new Rover(new Coordinates(1,2),'N',plateau);
		rover.move("LMLMLMLMM");
		System.out.println("Instruction: LMLMLMLMM");
		System.out.println(rover.getCurrentPosition());
		
		rover = new Rover(new Coordinates(3,3),'E',plateau);
		rover.move("MMRMMRMRRM");
		System.out.println("Instruction: MMRMMRMRRM");
		System.out.println(rover.getCurrentPosition());
		
	}

}
