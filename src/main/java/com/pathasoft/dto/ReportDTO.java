package com.pathasoft.dto;

import java.util.List;

import com.pathasoft.model.Report;

public class ReportDTO {
	
	private Report report;
	
	private List<TestFieldDTO> testField;

	/**
	 * @return the report
	 */
	public Report getReport() {
		return report;
	}

	/**
	 * @param report the report to set
	 */
	public void setReport(Report report) {
		this.report = report;
	}

	/**
	 * @return the testField
	 */
	public List<TestFieldDTO> getTestField() {
		return testField;
	}

	/**
	 * @param testField the testField to set
	 */
	public void setTestField(List<TestFieldDTO> testField) {
		this.testField = testField;
	}

	
	

}
