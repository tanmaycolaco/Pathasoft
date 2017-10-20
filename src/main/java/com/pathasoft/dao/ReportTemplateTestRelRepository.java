package com.pathasoft.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pathasoft.model.ReportTemplate;
import com.pathasoft.model.ReportTemplateTestRel;
import com.pathasoft.model.Test;

public interface ReportTemplateTestRelRepository extends JpaRepository<ReportTemplateTestRel, Long> {
	
	
	@Query("select rttr.test, rttr.reportTemplate from ReportTemplateTestRel rttr join rttr.reportTemplate rt  where rt.reportName = ?1 ")
	List<Test> getTestInReportTemplate(String templateName);
	
	
	@Query("select rttr.reportTemplate from ReportTemplateTestRel rttr join rttr.test t where t.testName = ?1")
	List<ReportTemplate> getReportTemplateByTestName(String testName);

}
