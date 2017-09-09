package com.pathasoft.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pathasoft.model.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {
	

}
