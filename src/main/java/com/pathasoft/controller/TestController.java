package com.pathasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pathasoft.dto.TestDTO;
import com.pathasoft.model.Test;
import com.pathasoft.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	TestService testService;
	
	 @RequestMapping(value = "/getTests", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Test> getReports(@RequestParam(required = false) Long id)
		{
			return testService.getAllTest(id);
		}
	 
	 @RequestMapping(value = "/createTest", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	 public Test createTest(@RequestBody TestDTO testDTO)
	 {
		return testService.createTest(testDTO);
		 
	 }
	 
	 @RequestMapping(value = "/addFieldToTest", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	 public TestDTO addFieldToTest(@RequestBody TestDTO testDTO)
	 {
		return testService.addFieldToTest(testDTO);
		 
	 }

}
