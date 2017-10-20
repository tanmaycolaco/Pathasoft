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
	private Long Id ;
	
	@Column(name = "report_code")
	private String reportCode;
	
	@Column(name = "report_name")
	private String reportName;
	
	@Column(name = "serial_number")
	private Long  serialNumber;
	
	
	@Column(name = "amount")
	private Double Amount;
	
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
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}

	/**
	 * @return the reportCode
	 */
	public String getReportCode() {
		return reportCode;
	}

	/**
	 * @param reportCode the reportCode to set
	 */
	public void setReportCode(String reportCode) {
		this.reportCode = reportCode;
	}

	/**
	 * @return the reportName
	 */
	public String getReportName() {
		return reportName;
	}

	/**
	 * @param reportName the reportName to set
	 */
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	/**
	 * @return the serialNumber
	 */
	public Long getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(Long serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return Amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		Amount = amount;
	}

	/**
	 * @return the decided
	 */
	public String getDecided() {
		return Decided;
	}

	/**
	 * @param decided the decided to set
	 */
	public void setDecided(String decided) {
		Decided = decided;
	}

	/**
	 * @return the checkNormal
	 */
	public String getCheckNormal() {
		return checkNormal;
	}

	/**
	 * @param checkNormal the checkNormal to set
	 */
	public void setCheckNormal(String checkNormal) {
		this.checkNormal = checkNormal;
	}

	/**
	 * @return the checkMethod
	 */
	public String getCheckMethod() {
		return checkMethod;
	}

	/**
	 * @param checkMethod the checkMethod to set
	 */
	public void setCheckMethod(String checkMethod) {
		this.checkMethod = checkMethod;
	}

	/**
	 * @return the impression
	 */
	public String getImpression() {
		return Impression;
	}

	/**
	 * @param impression the impression to set
	 */
	public void setImpression(String impression) {
		Impression = impression;
	}

	/**
	 * @return the interpretation
	 */
	public String getInterpretation() {
		return Interpretation;
	}

	/**
	 * @param interpretation the interpretation to set
	 */
	public void setInterpretation(String interpretation) {
		Interpretation = interpretation;
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
	

	

}
