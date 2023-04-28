package com.example.employeeservice.domain;

import jakarta.persistence.*;

@Entity
@Table(name="Employee_Tbl")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;

    private String fname;
    private String lname;
    private String deptid;
    private String dname;

    public Employee(Long empid){
        super();
        this.empid = empid;
    }
    public Employee(){
        super();
    }


    public Employee(String fname, String lname, String deptid, String dname) {
        this.fname = fname;
        this.lname = lname;
        this.deptid = deptid;
        this.dname = dname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }
}
