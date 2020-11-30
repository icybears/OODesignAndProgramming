package net.sabercrafts.oop.quarantine.printer;

import java.util.Collection;

import net.sabercrafts.oop.quarantine.Patient;

public interface Printer {

	String printFromCollection(Collection<Patient> patients);

}