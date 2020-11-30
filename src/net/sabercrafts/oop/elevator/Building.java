package net.sabercrafts.oop.elevator;

public class Building {

	private final int TOP_FLOOR;
	private final int LOWEST_FLOOR = 1;
	private ElevatorSystem elevatorSystem;

	public Building(int numberOfFloors, String... elevators) {

		this.TOP_FLOOR = numberOfFloors;
		elevatorSystem = new ElevatorSystemImpl(elevators, LOWEST_FLOOR, TOP_FLOOR);
	}

	public String requestElevator() {
		return elevatorSystem.requestElevatorFrom(TOP_FLOOR);

	}

	public String requestElevator(int requestFloor) {
		return elevatorSystem.requestElevatorFrom(requestFloor);

	}

	public void move(String elevatorId, String direction) {
		elevatorSystem.moveElevator(elevatorId, direction);

	}

	public void stopAt(String elevatorId, int floor) {
		elevatorSystem.stopElevator(elevatorId, floor);

	}

	public void setElevatorSystem(ElevatorSystem elevatorSystem) {
		this.elevatorSystem = elevatorSystem;
	}
}
