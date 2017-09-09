package com.pathasoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.pathasoft.dao.FieldRepository;
import com.pathasoft.model.Field;
import com.pathasoft.service.FieldService;

@Service
public class FieldServiceImpl implements FieldService {
	
	@Autowired
	private FieldRepository fieldRepository;

	@Override
	public List<Field> getFields(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Field> createFields(List<Field> fields) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
