package com.pathasoft.dto;

import java.util.List;

import com.pathasoft.model.Field;
import com.pathasoft.model.Test;

public class TestDTO {
	
	Test test;
	
	List<Field> fields;

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
	 * @return the fields
	 */
	public List<Field> getFields() {
		return fields;
	}

	/**
	 * @param fields the fields to set
	 */
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
	
	

}
