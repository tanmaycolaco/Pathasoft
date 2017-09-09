package com.pathasoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pathasoft.model.Field;

public interface FieldRepository extends JpaRepository<Field, Long>{
	

}
