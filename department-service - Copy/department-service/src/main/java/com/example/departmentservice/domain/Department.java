package com.example.departmentservice.domain;

import jakarta.persistence.*;

@Entity
@Table(name="Department_Tbl")
public class Department {
    @Id


    private String deptId;
    private String deptName;

    public Department(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
    public Department(){
        super();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String toString(){
        return "Department [deptId="+deptId+",deptName=" +deptName+"]";
    }
}
