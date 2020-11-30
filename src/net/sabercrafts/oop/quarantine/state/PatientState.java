package net.sabercrafts.oop.quarantine.state;

import net.sabercrafts.oop.quarantine.Patient;

public interface PatientState {

	void wait40days();
	void setOwner(Patient patient);
	
}
