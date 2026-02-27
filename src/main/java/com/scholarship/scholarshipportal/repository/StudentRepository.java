package com.scholarship.scholarshipportal.repository;

import com.scholarship.scholarshipportal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}