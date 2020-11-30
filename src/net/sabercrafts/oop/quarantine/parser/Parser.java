package net.sabercrafts.oop.quarantine.parser;

import java.util.Collection;

import net.sabercrafts.oop.quarantine.Patient;

public interface Parser {

	Collection<Patient> parseInput(String input);

}