package com.pathasoft.service;

import java.util.List;

import com.pathasoft.model.Report;

public interface ReportService {
	
	List<Report> getReports(Long id);
	
	Report saveReport(Report report);

}
