package com.pathasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pathasoft.model.Field;
import com.pathasoft.service.FieldService;

@RestController
public class FieldController {

	@Autowired
	FieldService fieldService;
	
	
	 @RequestMapping(value = "/getFieldByTest/{testName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Field> getReports(@PathVariable String testName)
		{
			return fieldService.getFieldByTest(testName);
		}
	 
	 @RequestMapping(value = "/getField/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public Field getReports(@PathVariable Long id)
		{
			return fieldService.getFieldById(id);
		}
	 
	 @RequestMapping(value = "/saveFields", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Field> getReports(@RequestBody List<Field> fields)
		{
			return fieldService.createFields(fields);
		}
	 
	
}
