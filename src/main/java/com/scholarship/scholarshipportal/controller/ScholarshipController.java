package com.scholarship.scholarshipportal.controller;

import com.scholarship.scholarshipportal.entity.Scholarship;
import com.scholarship.scholarshipportal.service.ScholarshipService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scholarship")
public class ScholarshipController {

    @Autowired
    private ScholarshipService scholarshipService;

    @PostMapping("/add")
    public Scholarship addScholarship(@RequestBody Scholarship scholarship) {
        return scholarshipService.saveScholarship(scholarship);
    }

    @GetMapping("/eligible/{studentId}")
    public List<Scholarship> eligible(@PathVariable Long studentId) {
        return scholarshipService.getEligibleScholarships(studentId);
    }
}