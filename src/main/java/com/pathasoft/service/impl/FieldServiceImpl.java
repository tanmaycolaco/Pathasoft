package com.pathasoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.pathasoft.dao.fieldRepository;
import com.pathasoft.model.Field;

@Service
public class FieldServiceImpl {
	@Autowired
	private fieldRepository fieldRepository;
	
	public List<Field> getallFields(){
		List<Field> fields=new ArrayList<>();
				((CrudRepository<com.pathasoft.model.Field, String>) fieldRepository).findAll().forEach(fields::add);
		return fields;
	}
	public void addField(Field field)
	{
		((CrudRepository<Field, String>) fieldRepository).save(field);
	}

}
