package com.example.employeeservice.controller;

import com.example.employeeservice.domain.Employee;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/vi")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp/{dept}")
    public Employee findEmployeeByDeptId(@PathVariable String dept){

        return employeeService.getEmployeeDetails(dept);
    }
    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeService.getEmployee();
    }

    @PostMapping("/employee/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employee/delete/{empid}")
    public void deleteEmployee(@PathVariable Long empid){
        employeeService.deleteEmployee(empid);
    }
}
