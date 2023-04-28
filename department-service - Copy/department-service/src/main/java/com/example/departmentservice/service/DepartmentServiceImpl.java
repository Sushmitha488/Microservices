package com.example.departmentservice.service;

import com.example.departmentservice.dao.DepartmentRepository;
import com.example.departmentservice.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department findDepartmentByDeptId(String deptId) {
        return new Department("1001","IT Department");
    }



    @Override
    public List<Department> getDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }



    @Override
    public void deleteDepartment(String deptId) {

        Department department=new Department();
        department.setDeptId(deptId);
        departmentRepository.delete(department);
    }
}
