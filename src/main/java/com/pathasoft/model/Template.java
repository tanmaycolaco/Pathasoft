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
@Table(name="Template")
public class Template {
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
	
	@Column(name = "tests")
	private String tests;
	
	@Column(name = "type")
	private String Type;
	
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
	@Temporal(TemporalType.DATE)
	@CreatedDate
	private Date createdDate;
	
	@Column(name = "last_Updated")
	@Temporal(TemporalType.DATE)
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

	public String getTests() {
		return tests;
	}

	public void setTests(String tests) {
		this.tests = tests;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
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

	public Template(long id, String reportCode, String reportName, long serialNumber, String tests, String type,
			double amount, String decided, String checkNormal, String checkMethod, String impression,
			String interpretation, int activeFlag, Date createdDate, Date lastUpdated) {
		super();
		Id = id;
		this.reportCode = reportCode;
		this.reportName = reportName;
		this.serialNumber = serialNumber;
		this.tests = tests;
		Type = type;
		Amount = amount;
		Decided = decided;
		this.checkNormal = checkNormal;
		this.checkMethod = checkMethod;
		Impression = impression;
		Interpretation = interpretation;
		this.activeFlag = activeFlag;
		this.createdDate = createdDate;
		this.lastUpdated = lastUpdated;
	}

	public Template() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
