package net.sabercrafts.oop.train;

import java.util.Collection;

import net.sabercrafts.oop.train.component.TrainComponent;

public class DefaultParser implements Parser {

	private ComponentBuilder builder;
	
	public DefaultParser(ComponentBuilder builder) {
		this.builder = builder;
	}

	@Override
	public Collection<TrainComponent> parseInput(String structure) {

		String[] structureArray = structure.split("");

		int wagonPosition = 1;

		for (String wagonStr : structureArray) {

			if (wagonStr.equals("H") && wagonPosition != structureArray.length) {

				builder.buildHead();

			} else if (wagonStr.equals("H") && wagonPosition == structureArray.length) {

				builder.buildInvertedHead();

			} else if (wagonStr.equals("R")) {

				builder.buildRestaurant();

			} else if (wagonStr.equals("P")) {

				builder.buildPassenger();

			} else if (wagonStr.equals("C")) {

				builder.buildCargo();

			}
			
			// as long as it is not the last element add a connector to it
			if (wagonPosition != structureArray.length) {
				builder.buildConnector();
			}

			wagonPosition++;

		}
		
		return builder.getResult();
	}

}
