package com.wipro.springrest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.springrest.entity.Patient;
import com.wipro.springrest.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	@Autowired
	PatientService patientService;
	@PostMapping("/save")
	public Patient savePatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}
	@GetMapping("/getall")
	public List<Patient> getAllPatient() {
		return patientService.getAllPatients();
	}
	@GetMapping("/get/{patientId}")
	public Patient getPatientById(@PathVariable int patientId) {
		return patientService.getPatientById(patientId);
	}
	@DeleteMapping("/delete/{patientId}")
	public String deletePatient(@PathVariable int patientId) {
		return patientService.deletePatient(patientId);
	}
	@PutMapping("/update")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}

}
