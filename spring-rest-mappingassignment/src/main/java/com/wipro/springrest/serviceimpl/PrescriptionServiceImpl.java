package com.wipro.springrest.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.springrest.entity.Prescription;
import com.wipro.springrest.repository.PrescriptionRepository;
import com.wipro.springrest.service.PrescriptionService;
@Service
public class PrescriptionServiceImpl implements PrescriptionService {
	@Autowired
	PrescriptionRepository prescriptionRepository;

	@Override
	public Prescription savePrescription(Prescription prescription) {
		// TODO Auto-generated method stub
		return prescriptionRepository.save(prescription);
	}

	@Override
	public List<Prescription> getAllPrescriptions() {
		// TODO Auto-generated method stub
		return prescriptionRepository.findAll();
	}

	@Override
	public Prescription getPrescriptionById(int prescriptionId) {
		// TODO Auto-generated method stub
		return prescriptionRepository.findById(prescriptionId).orElse(null);
	}

	@Override
	public String deletePrescription(int prescriptionId) {
		// TODO Auto-generated method stub
		return "Prescription deleted successfully";
	}

	@Override
	public Prescription updatePrescription(Prescription prescription) {
		// TODO Auto-generated method stub
		return prescriptionRepository.save(prescription);
	}

}
