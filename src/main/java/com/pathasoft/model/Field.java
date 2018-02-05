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
@Table(name = "fields")
public class Field {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "fieldname")
	private String fieldName;

	@Column(name = "malemax")
	private String maleMax;

	@Column(name = "malemin")
	private String maleMin;

	@Column(name = "femalemax")
	private String femaleMax;

	@Column(name = "femalemin")
	private String femaleMin;

	@Column(name = "childmax")
	private String childMax;

	@Column(name = "childmin")
	private String childMin;

	@Column(name = "fieldunit")
	private String fieldUnit;

	@Column(name = "fieldmethod")
	private String fieldMethod;

	@Column(name = "fielddefault")
	private String fieldDefault;

	@Column(name = "fieldsummary")
	private String fieldSummary;

	@Column(name = "active_flag")
	private Boolean activeFlag;

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
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName
	 *            the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the maleMax
	 */
	public String getMaleMax() {
		return maleMax;
	}

	/**
	 * @param maleMax
	 *            the maleMax to set
	 */
	public void setMaleMax(String maleMax) {
		this.maleMax = maleMax;
	}

	/**
	 * @return the maleMin
	 */
	public String getMaleMin() {
		return maleMin;
	}

	/**
	 * @param maleMin
	 *            the maleMin to set
	 */
	public void setMaleMin(String maleMin) {
		this.maleMin = maleMin;
	}

	/**
	 * @return the femaleMax
	 */
	public String getFemaleMax() {
		return femaleMax;
	}

	/**
	 * @param femaleMax
	 *            the femaleMax to set
	 */
	public void setFemaleMax(String femaleMax) {
		this.femaleMax = femaleMax;
	}

	/**
	 * @return the femaleMin
	 */
	public String getFemaleMin() {
		return femaleMin;
	}

	/**
	 * @param femaleMin
	 *            the femaleMin to set
	 */
	public void setFemaleMin(String femaleMin) {
		this.femaleMin = femaleMin;
	}

	/**
	 * @return the childMax
	 */
	public String getChildMax() {
		return childMax;
	}

	/**
	 * @param childMax
	 *            the childMax to set
	 */
	public void setChildMax(String childMax) {
		this.childMax = childMax;
	}

	/**
	 * @return the childMin
	 */
	public String getChildMin() {
		return childMin;
	}

	/**
	 * @param childMin
	 *            the childMin to set
	 */
	public void setChildMin(String childMin) {
		this.childMin = childMin;
	}

	/**
	 * @return the fieldUnit
	 */
	public String getFieldUnit() {
		return fieldUnit;
	}

	/**
	 * @param fieldUnit
	 *            the fieldUnit to set
	 */
	public void setFieldUnit(String fieldUnit) {
		this.fieldUnit = fieldUnit;
	}

	/**
	 * @return the fieldMethod
	 */
	public String getFieldMethod() {
		return fieldMethod;
	}

	/**
	 * @param fieldMethod
	 *            the fieldMethod to set
	 */
	public void setFieldMethod(String fieldMethod) {
		this.fieldMethod = fieldMethod;
	}

	/**
	 * @return the fieldDefault
	 */
	public String getFieldDefault() {
		return fieldDefault;
	}

	/**
	 * @param fieldDefault
	 *            the fieldDefault to set
	 */
	public void setFieldDefault(String fieldDefault) {
		this.fieldDefault = fieldDefault;
	}

	/**
	 * @return the fieldSummary
	 */
	public String getFieldSummary() {
		return fieldSummary;
	}

	/**
	 * @param fieldSummary
	 *            the fieldSummary to set
	 */
	public void setFieldSummary(String fieldSummary) {
		this.fieldSummary = fieldSummary;
	}

	/**
	 * @return the activeFlag
	 */
	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set
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
	 * @param lastUpdated
	 *            the lastUpdated to set
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
