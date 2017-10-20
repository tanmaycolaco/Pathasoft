package com.pathasoft.dto;

import java.util.List;

import com.pathasoft.model.ReportTemplate;
import com.pathasoft.model.Test;

public class ReportTemplateTestDTO {
	
	ReportTemplate reportTemplate;
	
	List<Test> tests;

	/**
	 * @return the reportTemplate
	 */
	public ReportTemplate getReportTemplate() {
		return reportTemplate;
	}

	/**
	 * @param reportTemplate the reportTemplate to set
	 */
	public void setReportTemplate(ReportTemplate reportTemplate) {
		this.reportTemplate = reportTemplate;
	}

	/**
	 * @return the tests
	 */
	public List<Test> getTests() {
		return tests;
	}

	/**
	 * @param tests the tests to set
	 */
	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	
	
	
	

}
