package com.pathasoft.service;

import java.util.List;

import com.pathasoft.model.ReportTemplate;
import com.pathasoft.model.Test;

public interface ReportTemplateService {
	
	
	List<Test>  getReportTemplateByName(String name);
	
	
	List<ReportTemplate> getRepoetTemplateByTestName(String testName);
	
	

}
