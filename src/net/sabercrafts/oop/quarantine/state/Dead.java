package net.sabercrafts.oop.quarantine.state;

import net.sabercrafts.oop.quarantine.Patient;

public class Dead implements PatientState{

	private Patient patient;
	
	@Override
	public void setOwner(Patient patient) {
		this.patient = patient;
		
	}
	
	@Override
	public void wait40days() {
		
		
	}

	

}