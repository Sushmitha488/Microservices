package com.example.departmentservice.controller;

import com.example.departmentservice.domain.Department;
import com.example.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @GetMapping("/dept/{deptId}")
    public Department getDepartmentDetails(@PathVariable String deptId){

        return departmentService.findDepartmentByDeptId(deptId);

    }
    @GetMapping("/department")
    public List<Department> getEmployees(){
        return departmentService.getDepartment();
    }

    @PostMapping("/dept/add")
    public Department addEmployee(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @DeleteMapping("/dept/delete/{deptId}")
    public void deleteEmployee(@PathVariable String deptId){
        departmentService.deleteDepartment(deptId);
    }

}
