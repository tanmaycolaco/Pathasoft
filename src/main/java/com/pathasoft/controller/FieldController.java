package com.pathasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pathasoft.model.Field;
import com.pathasoft.service.impl.FieldServiceImpl;

@RestController()
public class FieldController {

	@Autowired
	private FieldServiceImpl fieldServies;
	
	
	@RequestMapping("/Fields")
	public List<Field> getallFields() {
		return fieldServies.getallFields();
			}

	@RequestMapping(method=RequestMethod.POST,value="/Fields")
	public void addtest(@RequestBody Field fields) {
		fieldServies.addField(fields);
	}

	
	
}
