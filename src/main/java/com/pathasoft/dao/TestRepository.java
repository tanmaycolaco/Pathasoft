package com.pathasoft.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pathasoft.model.Test;

public interface TestRepository extends JpaRepository<Test, Long> {
	
	/*@Query("select t,f from Test t join Field f ON t.fieldName = f.fieldName")
	List<Test> getAllTestAndRelatedFields();*/

}
