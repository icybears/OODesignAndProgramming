package net.sabercrafts.oop.train;

import java.util.Collection;
import java.util.LinkedList;

import net.sabercrafts.oop.train.component.Cargo;
import net.sabercrafts.oop.train.component.Head;
import net.sabercrafts.oop.train.component.Passenger;
import net.sabercrafts.oop.train.component.Restaurant;
import net.sabercrafts.oop.train.component.TrainComponent;
import net.sabercrafts.oop.train.component.WagonConnector;

public class TrainComponentsBuilder implements ComponentBuilder{
	
	private Collection<TrainComponent> components = new LinkedList<>();

	@Override
	public void buildHead() {
		components.add(new Head(false));
		
	}

	@Override
	public void buildInvertedHead() {
		components.add(new Head(true));
		
	}

	@Override
	public void buildRestaurant() {
		components.add(new Restaurant());
		
	}

	@Override
	public void buildPassenger() {
		components.add(new Passenger());
		
	}

	@Override
	public void buildCargo() {
		components.add(new Cargo());
		
	}

	@Override
	public Collection<TrainComponent> getResult() {
		
		return components;
	}

	@Override
	public void buildConnector() {
		components.add(new WagonConnector());
		
	}
	
	
}
