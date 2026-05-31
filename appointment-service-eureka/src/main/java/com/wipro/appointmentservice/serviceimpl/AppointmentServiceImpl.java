package com.wipro.appointmentservice.serviceimpl;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.appointmentservice.entity.Appointment;
import com.wipro.appointmentservice.repository.AppointmentRepository;
import com.wipro.appointmentservice.service.AppointmentService;
import org.springframework.web.client.RestTemplate;
import com.wipro.appointmentservice.dto.DoctorDTO;
import com.wipro.appointmentservice.dto.PatientDTO;
import com.wipro.appointmentservice.dto.AppointmentResponseDTO;
@Service
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	private AppointmentRepository appointmentRepository;
	@Autowired
	private RestTemplate restTemplate;

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
	public void deleteAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		appointmentRepository.deleteById(appointmentId);
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}
	@Override
	public AppointmentResponseDTO getAppointmentDetails(int appointmentId) {
		Appointment appointment = appointmentRepository.findById(appointmentId).orElse(null);
		DoctorDTO doctor = restTemplate.getForObject("http://localhost:8082/doctor/get/" + appointment.getDoctorId(), DoctorDTO.class);
		PatientDTO patient = restTemplate.getForObject("http://localhost:8083/patient/get/" + appointment.getPatientId(), PatientDTO.class);
		AppointmentResponseDTO response = new AppointmentResponseDTO();
		response.setDoctor(doctor);
		response.setPatient(patient);
		return response;
	}

}
