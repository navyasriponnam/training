package com.wipro.doctorservice.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.doctorservice.entity.Doctor;
import com.wipro.doctorservice.service.DoctorService;
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	@PostMapping("/save")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		return doctorService.saveDoctor(doctor);
	}
	@GetMapping("/getall")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}
	@GetMapping("/get/{id}")
	public Doctor getDoctorById(@PathVariable int id) {
		return doctorService.getDoctorById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDoctor(@PathVariable int id) {
		doctorService.deleteDoctor(id);
		return "Doctor Deleted Successfully";
	}

}
