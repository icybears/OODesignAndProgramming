package net.sabercrafts.oop.quarantine.state.factory;

import net.sabercrafts.oop.quarantine.state.Dead;
import net.sabercrafts.oop.quarantine.state.Diabetes;
import net.sabercrafts.oop.quarantine.state.Fever;
import net.sabercrafts.oop.quarantine.state.Healthy;
import net.sabercrafts.oop.quarantine.state.PatientState;
import net.sabercrafts.oop.quarantine.state.Tuberculosis;

public class StateFactory {

	public static PatientState dead() {
		return new Dead();
	}
	
	public static PatientState healthy() {
		return new Healthy();
	}
	
	public static PatientState diabetes() {
		return new Diabetes();
	}
	
	public static PatientState fever() {
		return new Fever();
	}
	
	public static PatientState tuberculosis() {
		return new Tuberculosis();
	}
	
}
