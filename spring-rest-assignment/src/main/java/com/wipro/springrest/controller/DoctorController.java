package com.wipro.springrest.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.springrest.entity.Doctor;
import com.wipro.springrest.service.DoctorService;
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	@PostMapping("/save")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		return doctorService.saveDoctor(doctor);
	}
	@GetMapping("/getall")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}
	@GetMapping("/get/{doctorId}")
	public Doctor getDoctorById(@PathVariable int doctorId) {
		return doctorService.getDoctorById(doctorId);
	}
	@DeleteMapping("/delete/{doctorId}")
	public String deleteDoctor(@PathVariable int doctorId) {
		return doctorService.deleteDoctor(doctorId);
	}
	@PutMapping("/update")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return doctorService.updateDoctor(doctor);
	}

}
