package com.example.employeeservice.service;

import com.example.employeeservice.dao.EmployeeRepository;
import com.example.employeeservice.domain.Department;
import com.example.employeeservice.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;
    @Value("${department.url}")
    private String deptURL;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeDetails(String deptId){

        //communicate to department service
       ResponseEntity<Department> response= restTemplate.getForEntity(deptURL+deptId, Department.class);

       Department department=response.getBody();
        return new Employee("Dilip","Virk",deptId,department.getDeptName());
    }

    @Override
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long empid) {
        Employee employee=new Employee();
        employee.setEmpid(empid);
        employeeRepository.delete(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

}
