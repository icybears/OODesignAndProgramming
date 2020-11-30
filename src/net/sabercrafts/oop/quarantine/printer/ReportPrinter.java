package net.sabercrafts.oop.quarantine.printer;

import java.util.Collection;

import net.sabercrafts.oop.quarantine.Patient;
import net.sabercrafts.oop.quarantine.state.Diabetes;
import net.sabercrafts.oop.quarantine.state.Fever;
import net.sabercrafts.oop.quarantine.state.Healthy;
import net.sabercrafts.oop.quarantine.state.PatientState;
import net.sabercrafts.oop.quarantine.state.Tuberculosis;

public class ReportPrinter implements Printer {
	
	@Override
	public String printFromCollection(Collection<Patient> patients) {
		
		int healthyPatientsCount = 0;
		int patientsWithFeverCount = 0;
		int patientsWithDiabetiesCount = 0;
		int patientsWithTuberculosisCount = 0;
		int deadPatients = 0;
		
		PatientState state = null;
		
		for(Patient p : patients) {
			state = p.getState();
			
			if(state instanceof Healthy) {
				healthyPatientsCount++;
			} 
			else if (state instanceof Fever) {
				patientsWithFeverCount++;
			}
			else if (state instanceof Diabetes) {
				patientsWithDiabetiesCount++; 
			} 
			else if (state instanceof Tuberculosis) {
				patientsWithTuberculosisCount++;
			}
			else {
				deadPatients++;
			}
			
		}
		
			
		return printReport(healthyPatientsCount,patientsWithFeverCount,patientsWithDiabetiesCount,patientsWithTuberculosisCount,deadPatients);
		
	}

	private String printReport(int healthyPatientsCount, int patientsWithFeverCount, int patientsWithDiabetiesCount, int patientsWithTuberculosisCount, int deadPatients) {
		
		StringBuilder sb = new StringBuilder();
		
		sb
		.append("F:")
		.append(patientsWithFeverCount)
		.append(" ")
		.append("H:")
		.append(healthyPatientsCount)
		.append(" ")
		.append("D:")
		.append(patientsWithDiabetiesCount)
		.append(" ")
		.append("T:")
		.append(patientsWithTuberculosisCount)
		.append(" ")
		.append("X:")
		.append(deadPatients);
		
	return sb.toString();	
	}
}
