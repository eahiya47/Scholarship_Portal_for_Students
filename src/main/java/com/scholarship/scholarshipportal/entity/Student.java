package com.scholarship.scholarshipportal.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double tenthMarks;
    private double twelfthMarks;

    private Double cgpa;        // Nullable for first year

    private BigDecimal annualIncome; // Income certificate value

    // Getters & Setters

    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getTenthMarks() { return tenthMarks; }
    public void setTenthMarks(double tenthMarks) { this.tenthMarks = tenthMarks; }

    public double getTwelfthMarks() { return twelfthMarks; }
    public void setTwelfthMarks(double twelfthMarks) { this.twelfthMarks = twelfthMarks; }

    public Double getCgpa() { return cgpa; }
    public void setCgpa(Double cgpa) { this.cgpa = cgpa; }

    public BigDecimal getAnnualIncome() { return annualIncome; }
    public void setAnnualIncome(BigDecimal annualIncome) { this.annualIncome = annualIncome; }
}