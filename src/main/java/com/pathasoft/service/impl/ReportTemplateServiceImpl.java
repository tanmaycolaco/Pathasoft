package com.pathasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathasoft.dao.ReportTemplateTestRelRepository;
import com.pathasoft.model.ReportTemplate;
import com.pathasoft.model.Test;
import com.pathasoft.service.ReportTemplateService;

@Service
public class ReportTemplateServiceImpl implements ReportTemplateService {

	
	@Autowired
	ReportTemplateTestRelRepository reportTemplateTestRelRepository;
	
	@Override
	public List<Test> getReportTemplateByName(String name) {
		
		
		List<Test> tests = reportTemplateTestRelRepository.getTestInReportTemplate(name);
		
		
		return tests;
	}

	@Override
	public List<ReportTemplate> getRepoetTemplateByTestName(String testName) {
		
		return reportTemplateTestRelRepository.getReportTemplateByTestName(testName);
		
	}

}
