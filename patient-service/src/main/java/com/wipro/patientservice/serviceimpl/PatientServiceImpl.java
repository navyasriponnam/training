package com.wipro.patientservice.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.patientservice.entity.Patient;
import com.wipro.patientservice.repository.PatientRepository;
import com.wipro.patientservice.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepository patientRepository;

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
	public void deletePatient(int patientId) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(patientId);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

}
