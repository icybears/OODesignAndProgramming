package net.sabercrafts.oop.train.component;

public class Cargo implements FillableWagon {

	private String stringRepresentation;
	private boolean isFilled;

	public Cargo() {

		this.isFilled = false;

		stringRepresentation = ComponentStringRepresentation.EMPTY_CARGO.getString();
	}

	@Override
	public String getStringRepresentation() {

		return stringRepresentation;
	}

	@Override
	public void fill() {

		if (this.isFilled) {
			return;
		}

		isFilled = true;
		stringRepresentation = ComponentStringRepresentation.FILLED_CARGO.getString();

	}

	@Override
	public boolean isFilled() {

		return this.isFilled;
	}

}
