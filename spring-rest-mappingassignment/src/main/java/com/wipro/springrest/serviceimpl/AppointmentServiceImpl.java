package com.wipro.springrest.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.springrest.entity.Appointment;
import com.wipro.springrest.repository.AppointmentRepository;
import com.wipro.springrest.service.AppointmentService;
@Service
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;

	@Override
	public Appointment saveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	@Override
	public Appointment getAppointmentById(int appointmentId) {
		// TODO Auto-generated method stub
		return appointmentRepository.findById(appointmentId).orElse(null);
	}

	@Override
	public String deleteAppointment(int AppointmentId) {
		// TODO Auto-generated method stub
		return "Appointment deleted successfully";
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

}
