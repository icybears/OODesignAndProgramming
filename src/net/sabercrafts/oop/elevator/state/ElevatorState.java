package net.sabercrafts.oop.elevator.state;

public interface ElevatorState {

	int distanceTo(int requestedFloor, int minFloor, int maxFloor);
}
