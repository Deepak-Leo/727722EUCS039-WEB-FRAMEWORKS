package com.example.cy1.model;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Department {
    @JsonProperty("dept")
    private String departmentName;
    @JsonProperty("br")
    private String branch;
    public Department(String departmentName, String branch) {
        this.departmentName = departmentName;
        this.branch = branch;
    }
    public String getDepartmentName() {
        return departmentName;
    }

    public String getBranch() {
        return branch;
    }

}