package com.example.departmentservice.service;

import com.example.departmentservice.domain.Department;

import java.util.List;

public interface DepartmentService {

    public Department findDepartmentByDeptId(String deptId);
    public List<Department> getDepartment();

    Department addDepartment(Department department);

    void deleteDepartment(String deptId);
}
