package net.sabercrafts.oop.elevator;

public interface ElevatorMaker { 
	
	Elevator fromString(String source) throws IllegalArgumentException;
	
}
