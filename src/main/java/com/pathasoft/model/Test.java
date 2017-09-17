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
@Table(name="tests")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private long Id;
	
	@Column(name = "testname")
	private String testName;
	
	@Column(name = "fieldname")
	private String fieldName;
	
	@Column(name = "amount")
	private String amount;
	
	
	/*@Column(name = "active_Flag")
	private int activeFlag;

	@Column(name = "created_date")
	@Temporal(TemporalType.DATE)
	@CreatedDate
	private Date createdDate;
	
	@Column(name = "last_Updated")
	@Temporal(TemporalType.DATE)
	@LastModifiedDate
	private Date lastUpdated;*/

	
	/**
	 * @return the id
	 */
	public long getId() {
		return Id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		Id = id;
	}



	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}



	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}



	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}



	/**
	 * @param fieldName the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}



	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}



	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Test [Id=" + Id + ", testName=" + testName + ", fieldName=" + fieldName + ", amount=" + amount + "]";
	}
	

	
	
}
