package net.sabercrafts.oop.quarantine;

import java.util.ArrayList;
import java.util.List;

import net.sabercrafts.oop.quarantine.parser.DefaultParser;
import net.sabercrafts.oop.quarantine.parser.Parser;
import net.sabercrafts.oop.quarantine.printer.Printer;
import net.sabercrafts.oop.quarantine.printer.ReportPrinter;
import net.sabercrafts.oop.quarantine.treatment.factory.TreatmentFactory;

public class Quarantine {
	
	private Parser parser = new DefaultParser();
	
	private Printer printer = new ReportPrinter();
	
	private List<Patient> patients = new ArrayList<>();
	
	public Quarantine(String participants) {
		patients = (List<Patient>) parser.parseInput(participants);

	}
	
	public String report() {
		return printer.printFromCollection(patients);
	}
	
	public void wait40Days() {
		patients.stream().forEach(Patient::wait40days);
	}
	
	public void paracetamol() {
		patients.stream().forEach(p -> p.applyTreatment(TreatmentFactory.paracetamol()));
	}
	public void insulin() {
		patients.stream().forEach(p -> p.applyTreatment(TreatmentFactory.insulin()));
	}
	public void antibiotic() {
		patients.stream().forEach(p -> p.applyTreatment(TreatmentFactory.antibiotic()));
	}
	public void aspirin() {
		patients.stream().forEach(p -> p.applyTreatment(TreatmentFactory.aspirin()));
	}
}

