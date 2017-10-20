package com.pathasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pathasoft.model.Test;
import com.pathasoft.service.ReportTemplateService;

@RestController
public class ReportTemplateController {
	
	
	@Autowired
	ReportTemplateService reportTemplateService;
	
	
	@RequestMapping(value = "/getTestInReportTemplate/{reportTemplateName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Test> getTestInReportTemplate(@PathVariable String reportTemplateName)
	 {
		return reportTemplateService.getReportTemplateByName(reportTemplateName);
		 
	 }
	
	@RequestMapping(value = "/getReportTemplateByTestName/{testName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Test> getReportTemplateByTestName(@PathVariable String testName)
	 {
		return reportTemplateService.getReportTemplateByName(testName);
		 
	 }
	

}
