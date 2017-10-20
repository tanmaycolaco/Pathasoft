package com.pathasoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import com.pathasoft.constants.ApplicationConstants;
import com.pathasoft.util.DateUtil;
import com.pathasoft.util.UniqueIdGenerationUtil;

@Entity
@Table(name="reports")
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
		
	@Column(name = "report_id")
	private String reportId;
	
	
	@OneToOne
	private ReportTemplate reportTemplate;
	
	@Column(name = "registered_userid")
	private Long registeredUserid;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "mode_payment")
	private String modePayment;
	
	@Column(name = "cheque_number")
	private String chequeNumber;
	
	@Column(name = "taxes")
	private Double  taxes;
	
	@Column(name = "net")
	private Double  net;
	
	@Column(name = "paid")
	private Double  paid;
	
	@Column(name = "balance")
	private Double  balance;
	
	@Column(name = "patient_name")
	private String patientName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "age")
	private Integer age;
	
	@Column(name = "report_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date reportTime;
	
	@Column(name = "report_note")
	private String reportNote;
	
	@OneToOne
	private Doctor doctor;
	
	@Column(name = "active_Flag")
	private Integer activeFlag;
	
	@Column(name = "created_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createdDate;
	
	@Column(name = "last_Updated")
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date lastUpdated;
	
	

	/**
	 * @return the reportTemplate
	 */
	public ReportTemplate getReportTemplate() {
		return reportTemplate;
	}

	/**
	 * @param reportTemplate the reportTemplate to set
	 */
	public void setReportTemplate(ReportTemplate reportTemplate) {
		this.reportTemplate = reportTemplate;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the reportId
	 */
	public String getReportId() {
		return reportId;
	}

	/**
	 * @param reportId the reportId to set
	 */
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	/**
	 * @return the registeredUserid
	 */
	public Long getRegisteredUserid() {
		return registeredUserid;
	}

	/**
	 * @param registeredUserid the registeredUserid to set
	 */
	public void setRegisteredUserid(Long registeredUserid) {
		this.registeredUserid = registeredUserid;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the modePayment
	 */
	public String getModePayment() {
		return modePayment;
	}

	/**
	 * @param modePayment the modePayment to set
	 */
	public void setModePayment(String modePayment) {
		this.modePayment = modePayment;
	}

	/**
	 * @return the chequeNumber
	 */
	public String getChequeNumber() {
		return chequeNumber;
	}

	/**
	 * @param chequeNumber the chequeNumber to set
	 */
	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	/**
	 * @return the taxes
	 */
	public Double getTaxes() {
		return taxes;
	}

	/**
	 * @param taxes the taxes to set
	 */
	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	/**
	 * @return the net
	 */
	public Double getNet() {
		return net;
	}

	/**
	 * @param net the net to set
	 */
	public void setNet(Double net) {
		this.net = net;
	}

	/**
	 * @return the paid
	 */
	public Double getPaid() {
		return paid;
	}

	/**
	 * @param paid the paid to set
	 */
	public void setPaid(Double paid) {
		this.paid = paid;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the reportTime
	 */
	public Date getReportTime() {
		return reportTime;
	}

	/**
	 * @param reportTime the reportTime to set
	 */
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	/**
	 * @return the reportNote
	 */
	public String getReportNote() {
		return reportNote;
	}

	/**
	 * @param reportNote the reportNote to set
	 */
	public void setReportNote(String reportNote) {
		this.reportNote = reportNote;
	}

	/**
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	/**
	 * @return the activeFlag
	 */
	public Integer getActiveFlag() {
		return activeFlag;
	}

	/**
	 * @param activeFlag the activeFlag to set
	 */
	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the lastUpdated
	 */
	public Date getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * @param lastUpdated the lastUpdated to set
	 */
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
	
	

	public void setReportObjectForSave()
	{
		createdDate = DateUtil.getCurrentTimeStamp();
		lastUpdated = DateUtil.getCurrentTimeStamp();
		reportTime = DateUtil.getCurrentTimeStamp();
		reportId =   UniqueIdGenerationUtil.getUniqueId(ApplicationConstants.REPORT_PREFIX);
	}



}
