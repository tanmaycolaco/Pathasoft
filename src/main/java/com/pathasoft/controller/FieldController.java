package com.pathasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pathasoft.model.Field;
import com.pathasoft.service.FieldService;

@RestController()
public class FieldController {

	@Autowired
	private FieldService fieldServies;
	
	
	

	
	
}
