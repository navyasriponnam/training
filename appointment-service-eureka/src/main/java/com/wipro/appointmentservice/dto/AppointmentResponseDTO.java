package com.wipro.appointmentservice.dto;

public class AppointmentResponseDTO {
	private DoctorDTO doctor;
	private PatientDTO patient;
	public AppointmentResponseDTO() {
		
	}
	public DoctorDTO getDoctor() {
		return doctor;
	}
	public void setDoctor(DoctorDTO doctor) {
		this.doctor = doctor;
	}
	public PatientDTO getPatient() {
		return patient;
	}
	public void setPatient(PatientDTO patient) {
		this.patient = patient;
	}

}
