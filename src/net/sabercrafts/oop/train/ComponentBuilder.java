package net.sabercrafts.oop.train;

import java.util.Collection;

import net.sabercrafts.oop.train.component.TrainComponent;

public interface ComponentBuilder {

	void buildHead();
	void buildInvertedHead();
	void buildRestaurant();
	void buildPassenger();
	void buildCargo();
	void buildConnector();
	Collection<TrainComponent> getResult();
}
