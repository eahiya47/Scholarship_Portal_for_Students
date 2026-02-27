package com.scholarship.scholarshipportal.repository;

import com.scholarship.scholarshipportal.entity.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScholarshipRepository extends JpaRepository<Scholarship, Long> {
}