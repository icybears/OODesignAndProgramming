package net.sabercrafts.oop.elevator;

import net.sabercrafts.oop.elevator.state.ElevatorState;
import net.sabercrafts.oop.elevator.state.factory.StateFactoryImpl;

public class Elevator {

	private String id;
	 
	private int currentPosition;
	
	private ElevatorState currentState;
	
	public Elevator(String id, int initialPosition) {
		this.id = id;
		currentPosition = initialPosition;
		currentState = StateFactoryImpl.getInstance().getRestingState(this);
	}

	public int getPosition() {
		return currentPosition;
	}
	
	public ElevatorState getState() {
		return null;
	}
	
	public void setState(ElevatorState state) {
		this.currentState = state;
	}

	public String getId() {
		
		return id;
	}
	
	public int distanceTo(int requestedFloor, int minFloor, int maxFloor) {
		
		return currentState.distanceTo(requestedFloor, minFloor, maxFloor);
		
	}
	
	public void moveUp() {
		currentState = StateFactoryImpl.getInstance().getMovingUpState(this);
	}
	
	public void moveDown() {
		currentState = StateFactoryImpl.getInstance().getMovingDownState(this);
	}
	
	public void stop(int floor) {
		currentState = StateFactoryImpl.getInstance().getStoppedState(this);
	}
	
	@Override
	public String toString() {
		
		return "Elevator:"+id+" - Position: "+currentPosition+" - "+" -State: "+currentState;
	}
}
