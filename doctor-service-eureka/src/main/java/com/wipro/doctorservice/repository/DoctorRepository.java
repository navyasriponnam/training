package com.wipro.doctorservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.wipro.doctorservice.entity.Doctor;
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
