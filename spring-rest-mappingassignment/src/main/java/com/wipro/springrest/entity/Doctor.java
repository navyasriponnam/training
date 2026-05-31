package com.wipro.springrest.entity;
import java.util.List;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;


import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	private int doctorId;
	private String doctorName;
	private String specialization;
	private int experience;
	@OneToMany(mappedBy = "doctor")
	private List<Appointment> appointments;
public Doctor() {
		
	}
public Doctor(int doctorId, String doctorName, String specialization, int experience) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
	this.specialization = specialization;
	this.experience = experience;
}
	
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

}
