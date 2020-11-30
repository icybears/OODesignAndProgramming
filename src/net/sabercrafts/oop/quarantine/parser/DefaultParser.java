package net.sabercrafts.oop.quarantine.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import net.sabercrafts.oop.quarantine.DefaultPatientFactory;
import net.sabercrafts.oop.quarantine.Patient;
import net.sabercrafts.oop.quarantine.PatientFactory;

public class DefaultParser implements Parser {
	
	private PatientFactory patientFactory = new DefaultPatientFactory();

	@Override
	public Collection<Patient> parseInput(String input) {
		
		Collection<Patient> patients = new ArrayList<>();
		
		String[] inputArray = input.split(",");
		
		for(String s : inputArray) {
			switch(s) {
			case "H":
				patients.add(patientFactory.healthy());
				break;
			case "F":
				patients.add(patientFactory.withFever());
				break;
			case "T":
				patients.add(patientFactory.withTuberculosis());
				break;
			case "D":
				patients.add(patientFactory.withDiabetes());
				break;
			}
		}
		return patients;
	}
}
