package com.pathasoft.service;

import java.util.List;

import com.pathasoft.dto.ReportDTO;
import com.pathasoft.model.Report;

public interface ReportService {
	
	List<Report> getReports(Long id);
	
	Report saveReport(Report report);
	
	ReportDTO saveReport(ReportDTO reportDTO);
	
	ReportDTO getReportByReportId(String reportId);
	

}
