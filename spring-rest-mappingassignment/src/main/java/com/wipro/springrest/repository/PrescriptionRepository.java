package com.wipro.springrest.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.wipro.springrest.entity.Prescription;
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

}
