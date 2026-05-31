package com.wipro.appointmentservice.controller;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.appointmentservice.entity.Appointment;
import com.wipro.appointmentservice.service.AppointmentService;
import com.wipro.appointmentservice.dto.AppointmentResponseDTO;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	@PostMapping("/save")
	public Appointment saveAppointment(@RequestBody Appointment appointment) {
		return appointmentService.saveAppointment(appointment);
	}
	@GetMapping("/getall")
	public List<Appointment> getAllAppointments() {
		return appointmentService.getAllAppointments();
	}
	@GetMapping("/get/{id}")
	public Appointment getAppointmentById(@PathVariable int id) {
		return appointmentService.getAppointmentById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteAppointment(@PathVariable int id) {
		appointmentService.deleteAppointment(id);
		return "Appointment Deleted Successfully";
	}
	@PutMapping("/update")
	public Appointment updateAppointment(@RequestBody Appointment appointment) {
		return appointmentService.updateAppointment(appointment);
	}
	@GetMapping("/details/{id}")
	public AppointmentResponseDTO getAppointmentDetails(@PathVariable int id) {
		return appointmentService.getAppointmentDetails(id);
	}

}
