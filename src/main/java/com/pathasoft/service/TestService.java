package com.pathasoft.service;

import java.util.List;

import com.pathasoft.dto.TestDTO;
import com.pathasoft.model.Test;

public interface TestService {
	
	
	List<Test> getAllTest(Long id);
	
	
	Test createTest(TestDTO testDTO);
	
	TestDTO addFieldToTest(TestDTO testDTO);

}
