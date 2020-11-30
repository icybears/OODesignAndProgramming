package net.sabercrafts.oop.quarantine;

public interface PatientFactory {

	Patient healthy();
	Patient withFever();
	Patient withDiabetes();
	Patient withTuberculosis();
	Patient dead();
}
