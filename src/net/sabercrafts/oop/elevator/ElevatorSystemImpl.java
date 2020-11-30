package net.sabercrafts.oop.elevator;

import java.util.HashMap;
import java.util.Map;

public class ElevatorSystemImpl implements ElevatorSystem {

	private int minFloor;

	private int maxFloor;

	private HashMap<String, Elevator> elevators = new HashMap<>();

	private ElevatorMaker elevatorMaker = new DefaultElevatorMaker();

	public ElevatorSystemImpl(String[] elevators, int minFloor, int maxFloor) {

		this.minFloor = minFloor;

		this.maxFloor = maxFloor;

		Elevator elevator;

		for (String e : elevators) {

			elevator = elevatorMaker.fromString(e);
			this.elevators.put(elevator.getId(), elevator);

		}
	}

	@Override
	public String requestElevatorFrom(int floor) {
		
		int smallest = maxFloor * 2;
		String candidate = null;
		Elevator elevator = null;

		for (Map.Entry<String, Elevator> e : elevators.entrySet()) {

			elevator = e.getValue();

			int distance = elevator.distanceTo(floor, minFloor, maxFloor);

			System.out.println(elevator + " - distance: " + distance);

			if (distance < smallest) {
				smallest = distance;
				candidate = e.getKey();
			} else {
				continue;
			}

		}
		return candidate;
	}

	@Override
	public void moveElevator(String elevatorId, String direction) {

		if (!elevatorExists(elevatorId)) {
			return;
		}

		Elevator elevator = elevators.get(elevatorId);

		if (direction.equals("UP")) {
			elevator.moveUp();
		} else if (direction.equals("DOWN")) {
			elevator.moveDown();
		}

	}

	@Override
	public void stopElevator(String elevatorId, int floor) {

		if (!elevatorExists(elevatorId)) {
			return;
		}

		elevators.get(elevatorId).stop(floor);

	}

	public void setElevatorMaker(ElevatorMaker elevatorMaker) {
		this.elevatorMaker = elevatorMaker;
	}

	private boolean elevatorExists(String id) {

		return elevators.containsKey(id);
	}

}
