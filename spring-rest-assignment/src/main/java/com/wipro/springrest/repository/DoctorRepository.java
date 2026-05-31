package com.wipro.springrest.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.wipro.springrest.entity.Doctor;
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
