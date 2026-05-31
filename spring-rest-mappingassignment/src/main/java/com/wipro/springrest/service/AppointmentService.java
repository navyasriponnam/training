package com.wipro.springrest.service;
import java.util.List;
import com.wipro.springrest.entity.Appointment;
public interface AppointmentService {
	Appointment saveAppointment(Appointment appointment);
	List<Appointment> getAllAppointments();
	Appointment getAppointmentById(int appointmentId);
	String deleteAppointment(int appointmentId);
	Appointment updateAppointment(Appointment appointment);

}
