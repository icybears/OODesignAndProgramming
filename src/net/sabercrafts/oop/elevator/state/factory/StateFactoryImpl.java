package net.sabercrafts.oop.elevator.state.factory;

import net.sabercrafts.oop.elevator.Elevator;
import net.sabercrafts.oop.elevator.state.ElevatorMovingDown;
import net.sabercrafts.oop.elevator.state.ElevatorMovingUp;
import net.sabercrafts.oop.elevator.state.ElevatorResting;
import net.sabercrafts.oop.elevator.state.ElevatorState;
import net.sabercrafts.oop.elevator.state.ElevatorStopped;

public class StateFactoryImpl implements StateFactory{
	
	private static StateFactory instance = new StateFactoryImpl();
	
	private StateFactoryImpl() {}
	
	public static StateFactory getInstance() {
		return instance;
	}

	@Override
	public ElevatorState getRestingState(Elevator owner) {
		
		return new ElevatorResting(owner);
	}

	@Override
	public ElevatorState getMovingUpState(Elevator owner) {
		
		return new ElevatorMovingUp(owner);
	}

	@Override
	public ElevatorState getMovingDownState(Elevator owner) {
	
		return new ElevatorMovingDown(owner);
	}

	@Override
	public ElevatorState getStoppedState(Elevator owner) {
		
		return new ElevatorStopped(owner);
	}

}
