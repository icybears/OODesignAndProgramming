package net.sabercrafts.oop.elevator;

public class DefaultElevatorMaker implements ElevatorMaker{

	public Elevator fromString(String source) throws IllegalArgumentException{
		String[] data = source.split(":");
		return new Elevator(data[0],Integer.parseInt(data[1]));
	}
}
