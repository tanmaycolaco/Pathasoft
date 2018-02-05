package com.pathasoft.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathasoft.dao.TestFieldRelRepository;
import com.pathasoft.dao.TestRepository;
import com.pathasoft.dto.TestDTO;
import com.pathasoft.model.Field;
import com.pathasoft.model.Test;
import com.pathasoft.model.TestFieldRel;
import com.pathasoft.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

	@Autowired
	TestRepository testRepository;

	@Autowired
	TestFieldRelRepository testFieldRelRepository;

	@Override
	public List<Test> getAllTest(Long id) {

		return testRepository.findAll();
	}

	@Override
	public Test createTest(TestDTO testDTO) {

		Test test = testRepository.save(testDTO.getTest());

		List<TestFieldRel> testFieldRels = new ArrayList<>();
		for (Field field : testDTO.getFields()) {

			TestFieldRel testFieldRel = new TestFieldRel();
			testFieldRel.setField(field);
			testFieldRel.setTest(test);
			testFieldRels.add(testFieldRel);
		}

		testFieldRelRepository.saveAll(testFieldRels);

		return test;
	}

	@Override
	public TestDTO addFieldToTest(TestDTO testDTO) {

		
		List<TestFieldRel> testFieldRels = new ArrayList<>();
		for (Field field : testDTO.getFields()) {

			TestFieldRel testFieldRel = new TestFieldRel();
			testFieldRel.setField(field);
			testFieldRel.setTest(testDTO.getTest());
			testFieldRels.add(testFieldRel);
		}

		testFieldRelRepository.saveAll(testFieldRels);

		return testDTO;
	}

}
