package net.sabercrafts.oop.train.component;

public class Head implements TrainComponent{

	String stringRepresentation;
	
	public Head(boolean isInverted) {
		
		if(isInverted) {
			stringRepresentation = ComponentStringRepresentation.INVERTED_HEAD.getString();
		} else {
			stringRepresentation = ComponentStringRepresentation.HEAD.getString();
		}
	}
	
	@Override
	public String getStringRepresentation() {
		
		return stringRepresentation;
	}

}
