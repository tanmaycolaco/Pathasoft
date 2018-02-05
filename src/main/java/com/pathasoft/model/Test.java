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
@Table(name="tests")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private long Id;
	
	@Column(name = "testname")
	private String testName;
	
	
	@Column(name = "amount")
	private String amount;
	
	
	@Column(name = "active_Flag")
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

	

	/**
	 * @return the activeFlag
	 */
	public Boolean getActiveFlag() {
		return activeFlag;
	}



	/**
	 * @param activeFlag the activeFlag to set
	 */
	public void setActiveFlag(Boolean activeFlag) {
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



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Test [Id=" + Id + ", testName=" + testName + ", amount=" + amount + ", activeFlag=" + activeFlag
				+ ", createdDate=" + createdDate + ", lastUpdated=" + lastUpdated + "]";
	}





	
	
}
