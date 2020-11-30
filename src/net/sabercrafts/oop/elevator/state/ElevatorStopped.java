package net.sabercrafts.oop.elevator.state;

import net.sabercrafts.oop.elevator.Elevator;

public class ElevatorStopped implements ElevatorState{
	
	private Elevator elevator;

	public ElevatorStopped(Elevator owner) {
		elevator = owner;
	}

	@Override
	public int distanceTo(int requestedFloor, int minFloor, int maxFloor) {

		return Integer.MAX_VALUE;

	}

	@Override
	public String toString() {
		return "Stopped";
	}
}
