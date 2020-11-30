package net.sabercrafts.oop.quarantine;

import net.sabercrafts.oop.quarantine.state.Dead;
import net.sabercrafts.oop.quarantine.state.Diabetes;
import net.sabercrafts.oop.quarantine.state.Fever;
import net.sabercrafts.oop.quarantine.state.Healthy;
import net.sabercrafts.oop.quarantine.state.Tuberculosis;
import net.sabercrafts.oop.quarantine.state.factory.StateFactory;

public class DefaultPatientFactory implements PatientFactory{

	@Override
	public Patient healthy() {
		
		return new Patient(StateFactory.healthy());
	}

	@Override
	public Patient withFever() {
		
		return new Patient(StateFactory.fever());
	}

	@Override
	public Patient withDiabetes() {
		
		return new Patient(StateFactory.diabetes());
	}

	@Override
	public Patient withTuberculosis() {
		
		return new Patient(StateFactory.tuberculosis());
	}

	@Override
	public Patient dead() {
		
		return new Patient(StateFactory.dead());
	}

}
