package com.wipro.patientservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.patientservice.entity.Patient;
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
