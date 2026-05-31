package com.wipro.patientservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.patientservice.entity.Patient;
import com.wipro.patientservice.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	private PatientService patientService;
	@PostMapping("/save")
	public Patient savePatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}
	@GetMapping("/getall")
	public List<Patient> getAllPatient() {
		return patientService.getAllPatients();
	}
	@GetMapping("/get/{id}")
	public Patient getPatientById(@PathVariable int id) {
		return patientService.getPatientById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deletePatient(@PathVariable int id) {
		patientService.deletePatient(id);
		return "Patient Deleted Successfully";
	}
	@PutMapping("/update")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}

}
