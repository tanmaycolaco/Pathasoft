package com.pathasoft.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathasoft.dao.TestRepository;
import com.pathasoft.model.Test;
import com.pathasoft.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	
	Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
	
	@Autowired
	TestRepository testRepository;

	@Override
	public List<Test> getAllTest(Long id) {
		
		return testRepository.findAll();
	}
	
	
	
	
	

}
