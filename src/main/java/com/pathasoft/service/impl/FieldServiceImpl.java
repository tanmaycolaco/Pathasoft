package com.pathasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathasoft.dao.FieldRepository;
import com.pathasoft.dao.TestFieldRelRepository;
import com.pathasoft.model.Field;
import com.pathasoft.service.FieldService;

@Service
public class FieldServiceImpl implements FieldService {
	
	
	@Autowired
	private FieldRepository fieldRepository;
	
	@Autowired
	private TestFieldRelRepository testFieldRelRepository;

	@Override
	public List<Field> getFields() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Field> createFields(List<Field> fields) {
		
		fields = fieldRepository.saveAll(fields);
		
		return fields;
	}

	@Override
	public List<Field> getFieldByTest(String testName) {
		
		return testFieldRelRepository.getFieldsByTestName(testName);
		
	}

	@Override
	public Field getFieldById(Long id) {
		
		return fieldRepository.getOne(id);
	}
	
	
	

}
