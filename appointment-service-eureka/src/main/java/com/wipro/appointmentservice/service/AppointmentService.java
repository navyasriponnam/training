package com.wipro.appointmentservice.service;
import java.util.List;



import com.wipro.appointmentservice.entity.Appointment;
import com.wipro.appointmentservice.dto.AppointmentResponseDTO;
public interface AppointmentService {
	Appointment saveAppointment(Appointment appointment);
	List<Appointment> getAllAppointments();
	Appointment getAppointmentById(int appointmentId);
	void deleteAppointment(int appointmentId);
	Appointment updateAppointment(Appointment appointment);
	AppointmentResponseDTO getAppointmentDetails(int appointmentId);

}
