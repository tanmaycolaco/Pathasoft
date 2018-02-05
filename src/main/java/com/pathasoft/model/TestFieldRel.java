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


@Entity
@Table(name = "test_field_rel")
public class TestFieldRel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToOne
	private Test test;
	
	@OneToOne
	private Field field;
	
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
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the test
	 */
	public Test getTest() {
		return test;
	}


	/**
	 * @param test the test to set
	 */
	public void setTest(Test test) {
		this.test = test;
	}


	/**
	 * @return the field
	 */
	public Field getField() {
		return field;
	}


	/**
	 * @param field the field to set
	 */
	public void setField(Field field) {
		this.field = field;
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
