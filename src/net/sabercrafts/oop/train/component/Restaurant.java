package net.sabercrafts.oop.train.component;

public class Restaurant implements TrainComponent{

	String stringRepresentation = ComponentStringRepresentation.RESTAURANT.getString();
	
	@Override
	public String getStringRepresentation() {
	
		return stringRepresentation;
	}

}
