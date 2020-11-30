package net.sabercrafts.oop.quarantine.treatment.factory;

import net.sabercrafts.oop.quarantine.treatment.Antibiotics;
import net.sabercrafts.oop.quarantine.treatment.Aspirin;
import net.sabercrafts.oop.quarantine.treatment.Insulin;
import net.sabercrafts.oop.quarantine.treatment.Paracetamol;
import net.sabercrafts.oop.quarantine.treatment.Treatment;

public class TreatmentFactory {

	public static Treatment antibiotic() {
		return new Antibiotics();
	}
	
	public static Treatment insulin() {
		return new Insulin();
	}
	
	public static Treatment paracetamol() {
		return new Paracetamol();
	}
	
	public static Treatment aspirin() {
		return new Aspirin();
	}
}
