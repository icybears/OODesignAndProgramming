package net.sabercrafts.oop.elevator.state;

import net.sabercrafts.oop.elevator.Elevator;

public class ElevatorMovingDown implements ElevatorState{
	
	private Elevator elevator;
	
	public ElevatorMovingDown(Elevator owner) {
		elevator = owner;
	}

	@Override
	public int distanceTo(int requestedFloor, int minFloor, int maxFloor) {
	
		int currentPosition = elevator.getPosition();
		
		if(requestedFloor < currentPosition) {
			return currentPosition - requestedFloor;
		}
		else {
			return currentPosition - minFloor + Math.abs(minFloor - requestedFloor);
		}
	}

	@Override
	public String toString() {
		return "Moving Down";
	}
	
}
