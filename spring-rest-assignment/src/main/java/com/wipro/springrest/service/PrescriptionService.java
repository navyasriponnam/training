package com.wipro.springrest.service;
import java.util.List;

import com.wipro.springrest.entity.Prescription;
public interface PrescriptionService {
	Prescription savePrescription(Prescription prescription);
	List<Prescription> getAllPrescriptions();
	Prescription getPrescriptionById(int prescriptionId);
	String deletePrescription(int prescriptionId);
	Prescription updatePrescription(Prescription prescription);

}
