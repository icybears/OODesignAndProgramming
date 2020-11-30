package net.sabercrafts.oop.train.component;

public class WagonConnector implements TrainComponent {

	String stringRepresentation = ComponentStringRepresentation.WAGON_CONNECTOR.getString();

	@Override
	public String getStringRepresentation() {
		return stringRepresentation;
	}

}
