package com.wipro.springrest.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="prescription")
public class Prescription {
	@Id
	
	private String patientName;
	private String doctorName;
	private String medicine;
	private int prescriptionId;
	public Prescription() {
		
	}
	public Prescription(int prescriptionId, String patientName, String doctorName, String medicine) {
		super();
		this.prescriptionId = prescriptionId;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.medicine = medicine;
	}
	public int getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	

}
