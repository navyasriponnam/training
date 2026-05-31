package com.wipro.patientservice.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="patient")
public class Patient {
	@Id
	private int patientId;
	private String patientName;
	private int age;
	private String disease;
	private long phoneNumber;
	
	public Patient() {
	
	}
		public Patient(int patientId, String patientName, int age, String diesease, long phoneNumber) {
			super();
			this.patientId = patientId;
			this.patientName = patientName;
			this.age = age;
			this.disease = disease;
			this.phoneNumber = phoneNumber;
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
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
