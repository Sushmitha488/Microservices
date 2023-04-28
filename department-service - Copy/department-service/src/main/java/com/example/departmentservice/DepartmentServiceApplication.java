package com.example.departmentservice;

import com.example.departmentservice.dao.DepartmentRepository;
import com.example.departmentservice.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentServiceApplication implements CommandLineRunner {

	@Autowired
	private DepartmentRepository departmentRepository;
	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		departmentRepository.save(new Department("1001","IT Department"));
	}
}
