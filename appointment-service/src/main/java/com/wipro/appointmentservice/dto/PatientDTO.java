package com.wipro.appointmentservice.dto;

public class PatientDTO {
	private int patientId;
	private String patientName;
	private int age;
	private String diesease;
	public PatientDTO() {
		
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiesease() {
		return diesease;
	}
	public void setDiesease(String diesease) {
		this.diesease = diesease;
	}

}
