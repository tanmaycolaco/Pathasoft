package com.pathasoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="Patient_Details")
public class PatientDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
@Column(name = "registered_userid")
private long registeredUserid;
@Column(name = "register_date")
private String registerDate;
@Column(name = "patient_name")
private String patientName;
@Column(name = "gender")
private String gender;
@Column(name = "age")
private int age;
@Column(name = "doctor_name")
private String doctorName;
@Column(name = "gross")
private double gross;
@Column(name = "comisession")
private double comisession;
@Column(name = "doctor_cut")
private double doctorCut;
@Column(name = "test_details")
private String testDetils;
@Column(name = "active_Flag")
private int activeFlag;
@Column(name = "created_date")
@Temporal(TemporalType.DATE)
@CreatedDate
private Date createdDate;

@Column(name = "last_Updated")
@Temporal(TemporalType.DATE)
@LastModifiedDate
private Date lastUpdated;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public long getRegisteredUserid() {
	return registeredUserid;
}

public void setRegisteredUserid(long registeredUserid) {
	this.registeredUserid = registeredUserid;
}

public String getRegisterDate() {
	return registerDate;
}

public void setRegisterDate(String registerDate) {
	this.registerDate = registerDate;
}

public String getPatientName() {
	return patientName;
}

public void setPatientName(String patientName) {
	this.patientName = patientName;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getDoctorName() {
	return doctorName;
}

public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}

public double getGross() {
	return gross;
}

public void setGross(double gross) {
	this.gross = gross;
}

public double getComisession() {
	return comisession;
}

public void setComisession(double comisession) {
	this.comisession = comisession;
}

public double getDoctorCut() {
	return doctorCut;
}

public void setDoctorCut(double doctorCut) {
	this.doctorCut = doctorCut;
}

public String getTestDetils() {
	return testDetils;
}

public void setTestDetils(String testDetils) {
	this.testDetils = testDetils;
}

public int getActiveFlag() {
	return activeFlag;
}

public void setActiveFlag(int activeFlag) {
	this.activeFlag = activeFlag;
}

public Date getCreatedDate() {
	return createdDate;
}

public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

public Date getLastUpdated() {
	return lastUpdated;
}

public void setLastUpdated(Date lastUpdated) {
	this.lastUpdated = lastUpdated;
}

public PatientDetails(Long id, long registeredUserid, String registerDate, String patientName, String gender, int age,
		String doctorName, double gross, double comisession, double doctorCut, String testDetils, int activeFlag,
		Date createdDate, Date lastUpdated) {
	super();
	this.id = id;
	this.registeredUserid = registeredUserid;
	this.registerDate = registerDate;
	this.patientName = patientName;
	this.gender = gender;
	this.age = age;
	this.doctorName = doctorName;
	this.gross = gross;
	this.comisession = comisession;
	this.doctorCut = doctorCut;
	this.testDetils = testDetils;
	this.activeFlag = activeFlag;
	this.createdDate = createdDate;
	this.lastUpdated = lastUpdated;
}

public PatientDetails() {
	super();
	// TODO Auto-generated constructor stub
}

}
