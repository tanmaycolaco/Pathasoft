package com.pathasoft.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pathasoft.model.Field;

public interface FieldRepository extends JpaRepository<Field, Long>{
	
	
	/*@Query("select f from Field f JOIN Test t ON t.fieldName = f.fieldName where t.testName = ?1")
	List<Field> getFieldsByTest(String testName);*/

}
