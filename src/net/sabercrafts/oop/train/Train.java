package net.sabercrafts.oop.train;

import java.util.LinkedList;

import net.sabercrafts.oop.train.component.FillableWagon;
import net.sabercrafts.oop.train.component.Head;
import net.sabercrafts.oop.train.component.TrainComponent;
import net.sabercrafts.oop.train.component.WagonConnector;

public class Train {
	
	private LinkedList<TrainComponent> components;
	
	private Parser parser = new DefaultParser(new TrainComponentsBuilder());

	public Train(String structure) {
		components = (LinkedList<TrainComponent>) parser.parseInput(structure);
	}
	
	public void detachHead() {
		// detach the head 
		if(components.peek() instanceof Head) {
			components.poll();
		}
		// detach the trailing connector
		if(components.peek() instanceof WagonConnector) {
			components.poll();
		}
	}
	
	public void detachEnd() {
		//detach the ending head
		if(components.peekLast() instanceof Head) {
			components.pollLast();
		}
		//detach the trailing connector
		if(components.peekLast() instanceof WagonConnector) {
			components.pollLast();
		}
	}
	
	public String print() {
		StringBuilder str = new StringBuilder(); 
		
		for(TrainComponent component : components) {
			str.append(component.getStringRepresentation());
		}
		
		return str.toString();
	}
	
	public boolean fill() {
		
		for(TrainComponent component : components) {
			
			if(component instanceof FillableWagon) {
				
				if(((FillableWagon)component).isFilled()) {
					continue;
				}
				else {
					((FillableWagon)component).fill();
					return true;
				}
			}
		}
		return false;
	}

}
