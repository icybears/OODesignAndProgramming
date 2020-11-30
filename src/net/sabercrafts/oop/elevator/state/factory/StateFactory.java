package net.sabercrafts.oop.elevator.state.factory;

import net.sabercrafts.oop.elevator.Elevator;
import net.sabercrafts.oop.elevator.state.ElevatorState;

public interface StateFactory {

	ElevatorState getRestingState(Elevator owner);
	ElevatorState getMovingUpState(Elevator owner);
	ElevatorState getMovingDownState(Elevator owner);
	ElevatorState getStoppedState(Elevator owner);
	
}
