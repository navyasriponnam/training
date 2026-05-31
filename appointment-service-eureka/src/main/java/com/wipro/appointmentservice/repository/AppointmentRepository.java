package com.wipro.appointmentservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.wipro.appointmentservice.entity.Appointment;
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

}
