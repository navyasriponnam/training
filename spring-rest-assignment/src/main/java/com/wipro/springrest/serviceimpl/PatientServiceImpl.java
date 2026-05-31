package com.wipro.springrest.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.springrest.entity.Patient;
import com.wipro.springrest.repository.PatientRepository;
import com.wipro.springrest.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientRepository patientRepository;

	@Override
	public Patient savePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatientById(int patientId) {
		// TODO Auto-generated method stub
		return patientRepository.findById(patientId).orElse(null);
	}

	@Override
	public String deletePatient(int patientId) {
		// TODO Auto-generated method stub
		return "Patient deleted successfully";
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

}
