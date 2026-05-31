package com.wipro.doctorservice.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.doctorservice.entity.Doctor;
import com.wipro.doctorservice.repository.DoctorRepository;
import com.wipro.doctorservice.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(int doctorId) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctorId).orElse(null);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(doctorId);
	}
}
