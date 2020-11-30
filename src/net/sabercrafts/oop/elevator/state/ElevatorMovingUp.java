package net.sabercrafts.oop.elevator.state;

import net.sabercrafts.oop.elevator.Elevator;

public class ElevatorMovingUp implements ElevatorState {

	private Elevator elevator;

	public ElevatorMovingUp(Elevator owner) {
		elevator = owner;
	}

	@Override
	public int distanceTo(int requestedFloor, int minFloor, int maxFloor) {
		
		int currentPosition = elevator.getPosition();
		
		if(requestedFloor > currentPosition) {
			return requestedFloor - currentPosition;
		} else {
			return maxFloor - currentPosition + Math.abs(maxFloor - requestedFloor);
		}
		
		
	}
	
	@Override
	public String toString() {
		return "Moving Up";
	}

}
