package com.pathasoft.service;

import java.util.List;

import com.pathasoft.model.Field;

public interface FieldService {
	
	
	public Field getFieldById(Long id);
	
	public List<Field> getFields();
	
	public List<Field> createFields(List<Field> fields);
	
	public List<Field>  getFieldByTest(String testName);

}
