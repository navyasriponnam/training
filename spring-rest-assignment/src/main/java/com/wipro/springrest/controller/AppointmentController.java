package com.wipro.springrest.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.springrest.entity.Appointment;
import com.wipro.springrest.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;
	@PostMapping("/save")
	public Appointment saveAppointment(@RequestBody Appointment appointment) {
		return appointmentService.saveAppointment(appointment);
	}
	@GetMapping("/getall")
	public List<Appointment> getAllAppointments() {
		return appointmentService.getAllAppointments();
	}
	@GetMapping("/get/{appointmentId}")
	public Appointment getAppointmentById(@PathVariable int appointmentId) {
		return appointmentService.getAppointmentById(appointmentId);
	}
	@DeleteMapping("/delete/{appointmentId}")
	public String deleteAppointment(@PathVariable int appointmentId) {
		return appointmentService.deleteAppointment(appointmentId);
	}
	@PutMapping("/update")
	public Appointment updateAppointment(@RequestBody Appointment appointment) {
		return appointmentService.updateAppointment(appointment);
	}

}
