package net.sabercrafts.oop.elevator;

public interface ElevatorSystem {

	String requestElevatorFrom(int floor);

	void moveElevator(String elevatorId, String direction);

	void stopElevator(String elevatorId, int floor);

}