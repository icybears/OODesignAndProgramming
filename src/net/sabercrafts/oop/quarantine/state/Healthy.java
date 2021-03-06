package net.sabercrafts.oop.quarantine.state;

import java.util.Collection;

import net.sabercrafts.oop.quarantine.Patient;
import net.sabercrafts.oop.quarantine.state.factory.StateFactory;
import net.sabercrafts.oop.quarantine.treatment.Antibiotics;
import net.sabercrafts.oop.quarantine.treatment.Insulin;
import net.sabercrafts.oop.quarantine.treatment.Treatment;

public class Healthy implements PatientState {

	private Patient patient;

	@Override
	public void setOwner(Patient patient) {
		this.patient = patient;

	}

	@Override
	public void wait40days() {
		
		Collection<Treatment> treatments = patient.getTreatments();

		boolean hasInsulin = false;
		boolean hasAntibiotics = false;


		for (Treatment treatment : treatments) {
			if (treatment instanceof Insulin) {
				hasInsulin = true;
			}
			if (treatment instanceof Antibiotics) {
				hasAntibiotics = true;
			}
		
		}
		
		if (hasAntibiotics == true && hasInsulin == true) {
			patient.setState(StateFactory.fever());
		}

	}

}
