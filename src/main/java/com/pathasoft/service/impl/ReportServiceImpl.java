package com.pathasoft.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathasoft.dao.ReportRepository;
import com.pathasoft.exception.ApplicationException;
import com.pathasoft.model.Report;
import com.pathasoft.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ReportRepository reportRepository;

	@Override
	public List<Report> getReports(Long id) {
		
		logger.info("The id for fetching is :" + id);
		
		List<Report> reports = new ArrayList<>();
		
		try {
			if(id == null)
			{
				reports = reportRepository.findAll();
			}
			else {
				
				Report report = reportRepository.getOne(id);
				reports.add(report);
			}
		} catch (Exception e) {
			
			logger.error(e.getMessage());
			throw new ApplicationException(e.getMessage());
		}
		
		return reports;
	}

	@Override
	public Report saveReport(Report report) {
		logger.info("The report to be saved :"+ report.toString());
		
		try {
			report.setCreatedDate(new Date());
			report.setLastUpdated(new Date());
			 report  = reportRepository.save(report);
			 
		} catch (Exception e) {

			logger.error(e.getMessage());
			throw new ApplicationException(e.getMessage());
			
		}
		
		 return report;

		
	}

}
