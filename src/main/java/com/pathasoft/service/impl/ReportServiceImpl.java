package com.pathasoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathasoft.dao.ReportRepository;
import com.pathasoft.dao.ReportTestFieldRepository;
import com.pathasoft.dto.FieldActualValueDTO;
import com.pathasoft.dto.ReportDTO;
import com.pathasoft.dto.TestFieldDTO;
import com.pathasoft.exception.ApplicationException;
import com.pathasoft.model.Field;
import com.pathasoft.model.Report;
import com.pathasoft.model.ReportTestField;
import com.pathasoft.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ReportRepository reportRepository;
	
	@Autowired
	ReportTestFieldRepository reportTestFieldRepository ;

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
			 report.setReportObjectForSave();
			 report  = reportRepository.save(report);
			 
		} catch (Exception e) {

			logger.error(e.getMessage());
			throw new ApplicationException(e.getMessage());
			
		}
		
		 return report;

		
	}

	@Override
	public Boolean saveReport(ReportDTO reportDTO) {
		logger.info("The report to be saved :"+ reportDTO.toString());
		try{
			
			reportDTO.getReport().setReportObjectForSave();
			reportDTO.setReport(reportRepository.save(reportDTO.getReport()));
			List<ReportTestField> reportTestFields = new ArrayList<>();
			for(FieldActualValueDTO fieldActualValueDTO:reportDTO.getFieldValue())
			{
				ReportTestField reportTestField = new ReportTestField();
				reportTestField.setReport(reportDTO.getReport());
				reportTestField.setField(fieldActualValueDTO.getField());
				reportTestField.setFieldValue(fieldActualValueDTO.getActualValue());
				reportTestFields.add(reportTestField);
			}
			
			reportTestFieldRepository.saveAll(reportTestFields);
			
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
			throw new ApplicationException(e.getMessage());
		}
		
		return true;
	}

	@Override
	public ReportDTO getReportByReportId(String reportId) {
		
		
		
		return null;
	}

	
}
