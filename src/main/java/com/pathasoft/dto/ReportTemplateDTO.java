package com.pathasoft.dto;

import java.util.List;

import com.pathasoft.model.ReportTemplate;

public class ReportTemplateDTO {
	
	ReportTemplate reportTemplate;
	
	
	List<TestDTO>  testDTOs;


	

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
	 * @return the testDTOs
	 */
	public List<TestDTO> getTestDTOs() {
		return testDTOs;
	}


	/**
	 * @param testDTOs the testDTOs to set
	 */
	public void setTestDTOs(List<TestDTO> testDTOs) {
		this.testDTOs = testDTOs;
	}
	
	
	
	
	

}
