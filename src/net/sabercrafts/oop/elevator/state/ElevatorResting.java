package net.sabercrafts.oop.elevator.state;

import net.sabercrafts.oop.elevator.Elevator;

public class ElevatorResting implements ElevatorState {

	private Elevator elevator;

	public ElevatorResting(Elevator owner) {
		elevator = owner;
	}

	@Override
	public int distanceTo(int requestedFloor, int minFloor, int maxFloor) {
		
		return Math.abs(elevator.getPosition() - requestedFloor);
	}

	@Override
	public String toString() {
		return "Resting";
	}
}
