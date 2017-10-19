package com.pathasoft.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pathasoft.model.Field;
import com.pathasoft.model.TestFieldRel;

public interface TestFieldRelRepository extends JpaRepository<TestFieldRel, Long> {
	
	
	@Query("select tfr.field from TestFieldRel tfr join tfr.test t where t.testName = ?1 ")
	List<Field> getFieldsByTestName(String testName);
	

}
