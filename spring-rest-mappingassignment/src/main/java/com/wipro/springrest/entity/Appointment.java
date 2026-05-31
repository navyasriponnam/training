package com.wipro.springrest.entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="appointment")
public class Appointment {
	
	@Id
	private int appointmentId;
	private String appointmentDate;
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	public Appointment() {
		
	}
		public Appointment(int appointmentId, String appointmentDate, String status, Doctor doctor, Patient patient) {
			super();
			this.appointmentId = appointmentId;
			this.appointmentDate = appointmentDate;
			this.status = status;
			this.doctor = doctor;
			this.patient = patient;
		}

	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctorId(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
