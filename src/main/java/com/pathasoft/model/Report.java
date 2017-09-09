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

import com.pathasoft.constants.ApplicationConstants;
import com.pathasoft.util.DateUtil;
import com.pathasoft.util.UniqueIdGenerationUtil;

@Entity
@Table(name="report")
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
		
	@Column(name = "report_id")
	private String reportId;
	
	@Column(name = "registered_userid")
	private long registeredUserid;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "field")
	private String field;
	
	@Column(name = "field_values")
	private String fieldValues;
	
	@Column(name = "mode_payment")
	private String modePayment;
	
	@Column(name = "cheque_number")
	private String chequeNumber;
	
	@Column(name = "taxes")
	private double  taxes;
	
	@Column(name = "net")
	private double  net;
	
	@Column(name = "paid")
	private double  paid;
	
	@Column(name = "balance")
	private double  balance;
	
	@Column(name = "report_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date reportTime;
	
	@Column(name = "report_note")
	private String reportNote;
	
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

	public int getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public long getRegisteredUserid() {
		return registeredUserid;
	}

	public void setRegisteredUserid(long registeredUserid) {
		this.registeredUserid = registeredUserid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getFieldValues() {
		return fieldValues;
	}

	public void setFieldValues(String fieldValues) {
		this.fieldValues = fieldValues;
	}

	public String getModePayment() {
		return modePayment;
	}

	public void setModePayment(String modePayment) {
		this.modePayment = modePayment;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double getNet() {
		return net;
	}

	public void setNet(double net) {
		this.net = net;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getReportTime() {
		return reportTime;
	}

	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public String getReportNote() {
		return reportNote;
	}

	public void setReportNote(String reportNote) {
		this.reportNote = reportNote;
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


	
	
	@Override
	public String toString() {
		return "Report [id=" + id + ", reportId=" + reportId + ", registeredUserid=" + registeredUserid + ", amount="
				+ amount + ", field=" + field + ", fieldValues=" + fieldValues + ", modePayment=" + modePayment
				+ ", chequeNumber=" + chequeNumber + ", taxes=" + taxes + ", net=" + net + ", paid=" + paid
				+ ", balance=" + balance + ", reportTime=" + reportTime + ", reportNote=" + reportNote + ", activeFlag="
				+ activeFlag + ", createdDate=" + createdDate + ", lastUpdated=" + lastUpdated + "]";
	}

	public void setReportObjectForSave()
	{
		createdDate = DateUtil.getCurrentTimeStamp();
		lastUpdated = DateUtil.getCurrentTimeStamp();
		reportTime = DateUtil.getCurrentTimeStamp();
		reportId =   UniqueIdGenerationUtil.getUniqueId(ApplicationConstants.REPORT_PREFIX);
	}



}
