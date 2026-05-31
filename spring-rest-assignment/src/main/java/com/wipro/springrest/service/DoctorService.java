package com.wipro.springrest.service;
import java.util.List;


import com.wipro.springrest.entity.Doctor;
public interface DoctorService {
	Doctor saveDoctor(Doctor doctor);
	List<Doctor> getAllDoctors();
	Doctor getDoctorById(int doctorId);
	String deleteDoctor(int doctorId);
	Doctor updateDoctor(Doctor doctor);

}
