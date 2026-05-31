package com.wipro.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.springrest.entity.Prescription;
import com.wipro.springrest.service.PrescriptionService;
@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
	@Autowired
	PrescriptionService prescriptionService;
	@PostMapping("/save")
	public Prescription saveprescription(@RequestBody Prescription prescription) {
		return prescriptionService.savePrescription(prescription);
	}
	@GetMapping("/getall")
	public List<Prescription> getAllPrescriptions() {
		return prescriptionService.getAllPrescriptions();
	}
	@GetMapping("/get/{prescriptionId}")
	public Prescription getPrescriptionById(@PathVariable int prescriptionId) {
		return prescriptionService.getPrescriptionById(prescriptionId);
	}
	@DeleteMapping("/delete/{prescriptionId}")
	public String deletePrescription(@PathVariable int prescriptionId) {
		return prescriptionService.deletePrescription(prescriptionId);
	}
	@PutMapping("/update")
	public Prescription updatePrescription(@RequestBody Prescription prescription) {
		return prescriptionService.updatePrescription(prescription);
	}

}
