package com.scholarship.scholarshipportal.service;

import com.scholarship.scholarshipportal.entity.Student;
import com.scholarship.scholarshipportal.entity.Scholarship;
import com.scholarship.scholarshipportal.repository.StudentRepository;
import com.scholarship.scholarshipportal.repository.ScholarshipRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScholarshipService {

    @Autowired
    private ScholarshipRepository scholarshipRepository;

    @Autowired
    private StudentRepository studentRepository;

    public Scholarship saveScholarship(Scholarship scholarship) {
        return scholarshipRepository.save(scholarship);
    }

    public List<Scholarship> getEligibleScholarships(Long studentId) {

        Student student = studentRepository.findById(studentId).orElseThrow();

        List<Scholarship> allScholarships = scholarshipRepository.findAll();

        return allScholarships.stream()
                .filter(s -> Boolean.TRUE.equals(s.getActive())
                        && s.getDeadline().isAfter(LocalDate.now())
                        && student.getTenthMarks() >= s.getMinTenthMarks()
                        && student.getTwelfthMarks() >= s.getMinTwelfthMarks()
                        && student.getAnnualIncome().compareTo(s.getMaxIncome()) <= 0
                        && (student.getCgpa() == null
                                || s.getMinCgpa() == null
                                || student.getCgpa() >= s.getMinCgpa()))
                .collect(Collectors.toList());
    }
}