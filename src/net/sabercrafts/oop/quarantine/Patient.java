package net.sabercrafts.oop.quarantine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sabercrafts.oop.quarantine.state.PatientState;
import net.sabercrafts.oop.quarantine.state.factory.StateFactory;
import net.sabercrafts.oop.quarantine.treatment.Aspirin;
import net.sabercrafts.oop.quarantine.treatment.Paracetamol;
import net.sabercrafts.oop.quarantine.treatment.Treatment;

public class Patient {

	private PatientState state;
	private List<Treatment> treatments = new ArrayList<>();
	
	public Patient(PatientState state) {
		this.state = state;
		state.setOwner(this);
	}
	
	public PatientState getState() {
		return state;
	}
	
	public void applyTreatment(Treatment treatment) {
		treatments.add(treatment);
		checkDailyHealth();
	}
	
	public void wait40days() {
		this.state.wait40days();
	}
	
	public Collection<Treatment> getTreatments() {
		return treatments;
	}
	
	public void setState(PatientState state) {
		this.state = state;
	}
	
	private void checkDailyHealth() {
		
		boolean hasParacetamol = false;
		boolean hasAspirin = false;
		
		for(Treatment t: treatments) {
			if(t instanceof Aspirin)
				hasAspirin = true;
			
			if(t instanceof Paracetamol)
				hasParacetamol = true;
			
		}
		
		if(hasParacetamol && hasAspirin)
			this.state = StateFactory.dead();
	}
}
