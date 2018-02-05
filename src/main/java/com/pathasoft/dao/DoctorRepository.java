package com.pathasoft.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pathasoft.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>  {

}
