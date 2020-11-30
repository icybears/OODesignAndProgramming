package net.sabercrafts.oop.train;

import java.util.Collection;

import net.sabercrafts.oop.train.component.TrainComponent;

public interface Parser {

	Collection<TrainComponent> parseInput(String structure);

}