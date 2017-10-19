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
@Table(name="Doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
@Column(name = "code")
private String code;
@Column(name = "name_deg")
private String nameDeg;
@Column(name = "clinic_address")
private String clinicCity;
@Column(name = "clinic_city")
private String clinicAddress;
@Column(name = "clinic_pin")
private String clinicPin;
@Column(name = "clinic_tel")
private String clinicTel;
@Column(name = "mobile")
private String mobile;
@Column(name = "email")
private String email;
@Column(name = "reminder")
private String reminder;
@Column(name = "commission")
private double commission;

@Column(name = "active_Flag")
private int activeFlag;

@Column(name = "created_date")
@Temporal(TemporalType.TIMESTAMP)
@CreatedDate
private Date createdDate;

@Column(name = "last_Updated")
@Temporal(TemporalType.TIMESTAMP)
@LastModifiedDate
private Date lastUpdated;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getNameDeg() {
	return nameDeg;
}

public void setNameDeg(String nameDeg) {
	this.nameDeg = nameDeg;
}

public String getClinicCity() {
	return clinicCity;
}

public void setClinicCity(String clinicCity) {
	this.clinicCity = clinicCity;
}

public String getClinicAddress() {
	return clinicAddress;
}

public void setClinicAddress(String clinicAddress) {
	this.clinicAddress = clinicAddress;
}

public String getClinicPin() {
	return clinicPin;
}

public void setClinicPin(String clinicPin) {
	this.clinicPin = clinicPin;
}

public String getClinicTel() {
	return clinicTel;
}

public void setClinicTel(String clinicTel) {
	this.clinicTel = clinicTel;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getReminder() {
	return reminder;
}

public void setReminder(String reminder) {
	this.reminder = reminder;
}

public double getCommission() {
	return commission;
}

public void setCommission(double commission) {
	this.commission = commission;
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

public Doctor(long id, String code, String nameDeg, String clinicCity, String clinicAddress, String clinicPin,
		String clinicTel, String mobile, String email, String reminder, double commission, int activeFlag,
		Date createdDate, Date lastUpdated) {
	super();
	this.id = id;
	this.code = code;
	this.nameDeg = nameDeg;
	this.clinicCity = clinicCity;
	this.clinicAddress = clinicAddress;
	this.clinicPin = clinicPin;
	this.clinicTel = clinicTel;
	this.mobile = mobile;
	this.email = email;
	this.reminder = reminder;
	this.commission = commission;
	this.activeFlag = activeFlag;
	this.createdDate = createdDate;
	this.lastUpdated = lastUpdated;
}

public Doctor() {
	super();
	// TODO Auto-generated constructor stub
}

}
