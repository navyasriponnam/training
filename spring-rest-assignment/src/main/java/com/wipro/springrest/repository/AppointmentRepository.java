package com.wipro.springrest.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springrest.entity.Appointment;
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
