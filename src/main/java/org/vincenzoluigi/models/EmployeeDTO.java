package org.vincenzoluigi.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.time.LocalDate;

public class EmployeeDTO {

    private String code;
    private String fullName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate startDate;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String code, String fullName, LocalDate startDate) {
        this.code = code;
        this.fullName = fullName;
        this.startDate = startDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}