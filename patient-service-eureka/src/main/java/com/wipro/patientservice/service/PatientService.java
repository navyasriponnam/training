package com.wipro.patientservice.service;
import java.util.List;


import com.wipro.patientservice.entity.Patient;
public interface PatientService {
	Patient savePatient(Patient patient);
	List<Patient> getAllPatients();
	Patient getPatientById(int PatientId);
	void deletePatient(int patientId);
	Patient updatePatient(Patient patient);

}
