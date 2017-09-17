package com.pathasoft.service;

import java.util.List;

import com.pathasoft.model.Field;

public interface FieldService {
	
	public List<Field> getFields(Long id);
	
	public List<Field> createFields(List<Field> fields);
	
	public List<Field>  getFieldByTest(String testName);

}
