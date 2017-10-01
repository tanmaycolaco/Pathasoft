package com.pathasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pathasoft.dto.ReportDTO;
import com.pathasoft.model.Report;
import com.pathasoft.service.ReportService;

@RestController
public class ReportController {
	
	@Autowired
	ReportService reportService;
	
	/**
	 * will return all the reports if the passed id is null
	 * @param id
	 * @return
	 */
	 @RequestMapping(value = "/getReports", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Report> getReports(@RequestParam(required = false) Long id)
	{
		return reportService.getReports(id);
	}
	 
	 
	 @RequestMapping(value = "/saveReport", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
		public Report saveReport(@RequestBody Report report)
		{
			return reportService.saveReport(report);
		}
	 
	 @RequestMapping(value = "/saveReportNew",method = RequestMethod.POST)
	 public Boolean saveReport(@RequestBody ReportDTO reportDTO)
	 {
		 return reportService.saveReport(reportDTO);
	 }

}
