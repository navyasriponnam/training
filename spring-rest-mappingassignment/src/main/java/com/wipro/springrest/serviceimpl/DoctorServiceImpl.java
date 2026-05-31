package com.wipro.springrest.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.springrest.entity.Doctor;
import com.wipro.springrest.repository.DoctorRepository;
import com.wipro.springrest.service.DoctorService;
@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorRepository doctorRepository;

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
	public String deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		return "Doctor deleted successfully";
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

}
