package com.pathasoft.model;

import java.util.Date;

import javax.persistence.Basic;
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
@Table(name="test")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private long Id;
	
	@Column(name = "test_name")
	private String testName;
	
	@Column(name = "field_name")
	private String fieldName;
	
	@Column(name = "amount")
	private String amount;
	
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

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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

	public Test(long id, String testName, String fieldName, String amount, int activeFlag, Date createdDate,
			Date lastUpdated) {
		super();
		Id = id;
		this.testName = testName;
		this.fieldName = fieldName;
		this.amount = amount;
		this.activeFlag = activeFlag;
		this.createdDate = createdDate;
		this.lastUpdated = lastUpdated;
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
