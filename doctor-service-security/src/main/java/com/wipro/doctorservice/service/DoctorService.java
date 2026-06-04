package com.wipro.doctorservice.service;
import java.util.List;


import com.wipro.doctorservice.entity.Doctor;
public interface DoctorService {
	Doctor saveDoctor(Doctor doctor);
	List<Doctor> getAllDoctors();
	Doctor getDoctorById(int doctorId);
	void deleteDoctor(int doctorId);

}
