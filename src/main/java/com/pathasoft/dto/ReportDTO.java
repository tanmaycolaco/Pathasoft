package com.pathasoft.dto;

import java.util.List;

import com.pathasoft.model.Report;

public class ReportDTO {
	
	private Report report;
	
	private List<FieldActualValueDTO> fieldValue;

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
	 * @return the fieldValue
	 */
	public List<FieldActualValueDTO> getFieldValue() {
		return fieldValue;
	}

	/**
	 * @param fieldValue the fieldValue to set
	 */
	public void setFieldValue(List<FieldActualValueDTO> fieldValue) {
		this.fieldValue = fieldValue;
	}


	
	
	

}
