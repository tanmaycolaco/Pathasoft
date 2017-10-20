package com.pathasoft.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pathasoft.model.ReportTestField;

public interface ReportTestFieldRepository extends JpaRepository<ReportTestField,Long>{
	
	@Query(" select rtf from ReportTestField rtf join rtf.report r where r.reportId = ?1")
	List<ReportTestField> getReportDataByReportId(String id);
	

}
