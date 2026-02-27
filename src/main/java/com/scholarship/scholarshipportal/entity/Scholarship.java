package com.scholarship.scholarshipportal.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Scholarship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double minTenthMarks;
    private Double minTwelfthMarks;
    private Double minCgpa;

    private String type; // GOVT / PRIVATE
    private LocalDate deadline;
    private Boolean active;

    private BigDecimal maxIncome;

    private Double amount; // Scholarship amount

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinTenthMarks() {
        return minTenthMarks;
    }

    public void setMinTenthMarks(Double minTenthMarks) {
        this.minTenthMarks = minTenthMarks;
    }

    public Double getMinTwelfthMarks() {
        return minTwelfthMarks;
    }

    public void setMinTwelfthMarks(Double minTwelfthMarks) {
        this.minTwelfthMarks = minTwelfthMarks;
    }

    public Double getMinCgpa() {
        return minCgpa;
    }

    public void setMinCgpa(Double minCgpa) {
        this.minCgpa = minCgpa;
    }

    public BigDecimal getMaxIncome() {
        return maxIncome;
    }

    public void setMaxIncome(BigDecimal maxIncome) {
        this.maxIncome = maxIncome;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}