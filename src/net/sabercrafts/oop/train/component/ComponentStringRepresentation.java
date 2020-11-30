package net.sabercrafts.oop.train.component;

public enum ComponentStringRepresentation {

	HEAD("<HHHH"),
	INVERTED_HEAD("HHHH>"),
	PASSENGER("|OOOO|"),
	RESTAURANT("|hThT|"),
	EMPTY_CARGO("|____|"),
	FILLED_CARGO("|^^^^|"),
	WAGON_CONNECTOR("::");
	
	String value;

	ComponentStringRepresentation(String string) {
		this.value = string;
	}
	
	public String getString(){
		return value;
	}
	
}
