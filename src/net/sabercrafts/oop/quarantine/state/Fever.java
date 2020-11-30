package net.sabercrafts.oop.quarantine.state;

import java.util.Collection;

import net.sabercrafts.oop.quarantine.Patient;
import net.sabercrafts.oop.quarantine.state.factory.StateFactory;
import net.sabercrafts.oop.quarantine.treatment.Aspirin;
import net.sabercrafts.oop.quarantine.treatment.Paracetamol;
import net.sabercrafts.oop.quarantine.treatment.Treatment;

public class Fever implements PatientState {

	private Patient patient;

	@Override
	public void setOwner(Patient patient) {
		this.patient = patient;

	}

	@Override
	public void wait40days() {
		Collection<Treatment> treatments = patient.getTreatments();

		boolean hasAspirin = false;
		boolean hasParacetamol = false;

		for (Treatment treatment : treatments) {
			if (treatment instanceof Aspirin) {
				hasAspirin = true;
			}
			if (treatment instanceof Paracetamol) {
				hasParacetamol = true;
			}
		}
		
		if (hasAspirin != hasParacetamol) {
			patient.setState(StateFactory.healthy());
		}
	


	}

}