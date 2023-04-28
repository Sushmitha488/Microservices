package com.example.employeeservice.service;
import java.util.List;
import com.example.employeeservice.domain.Employee;

public interface EmployeeService {
   public Employee getEmployeeDetails(String dept);
   public List<Employee> getEmployee();
   public Employee addEmployee(Employee employee);
   public void deleteEmployee(Long empid);
   public Employee updateEmployee(Employee employee);
}
