package com.pathasoft.dto;

import java.util.List;

import com.pathasoft.model.Test;

public class TestFieldDTO {
	
	private Test test;
	
	private List<FieldActualValueDTO> fields;

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
	public List<FieldActualValueDTO> getFields() {
		return fields;
	}

	/**
	 * @param fields the fields to set
	 */
	public void setFields(List<FieldActualValueDTO> fields) {
		this.fields = fields;
	}

	
	
	
	

}
