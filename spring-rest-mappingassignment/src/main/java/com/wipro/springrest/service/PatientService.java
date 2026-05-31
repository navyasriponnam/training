package com.wipro.springrest.service;
import java.util.List;

import com.wipro.springrest.entity.Patient;
public interface PatientService {
	Patient savePatient(Patient patient);
	List<Patient> getAllPatients();
	Patient getPatientById(int PatientId);
	String deletePatient(int patientId);
	Patient updatePatient(Patient patient);

}
