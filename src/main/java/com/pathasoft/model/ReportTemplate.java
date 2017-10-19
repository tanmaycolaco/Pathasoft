package com.pathasoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="report_template")
public class ReportTemplate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id ")
	private long Id ;
	
	@Column(name = "report_code")
	private String reportCode;
	
	@Column(name = "report_name")
	private String reportName;
	
	@Column(name = "serial_number")
	private long  serialNumber;
	
	
	@Column(name = "amount")
	private double Amount;
	
	@Column(name = "decided")
	private String Decided;
	
	@Column(name = "check_normal")
	private String checkNormal;
	
	@Column(name = "check_method")
	private String checkMethod;
	
	@Column(name = "impression")
	private String Impression;
	
	@Column(name = "interpretation")
	private String Interpretation;
	
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
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getReportCode() {
		return reportCode;
	}

	public void setReportCode(String reportCode) {
		this.reportCode = reportCode;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}



	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getDecided() {
		return Decided;
	}

	public void setDecided(String decided) {
		Decided = decided;
	}

	public String getCheckNormal() {
		return checkNormal;
	}

	public void setCheckNormal(String checkNormal) {
		this.checkNormal = checkNormal;
	}

	public String getCheckMethod() {
		return checkMethod;
	}

	public void setCheckMethod(String checkMethod) {
		this.checkMethod = checkMethod;
	}

	public String getImpression() {
		return Impression;
	}

	public void setImpression(String impression) {
		Impression = impression;
	}

	public String getInterpretation() {
		return Interpretation;
	}

	public void setInterpretation(String interpretation) {
		Interpretation = interpretation;
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
	
	
	@PrePersist
	public void onPrePersist() {
		System.out.println("Pre Persist is Called");
		createdDate = new Date();
		lastUpdated = new Date();

	}

	@PreUpdate
	public void onPreUpdate() {

		System.out.println("Pre Update is Called");

		lastUpdated = new Date();

	}
	

	

}
