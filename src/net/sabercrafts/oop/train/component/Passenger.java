package net.sabercrafts.oop.train.component;

public class Passenger implements TrainComponent{

	String stringRepresentation = ComponentStringRepresentation.PASSENGER.getString();
	
	@Override
	public String getStringRepresentation() {
		return stringRepresentation;
	}

}
