package com.example.departmentservice.dao;

import com.example.departmentservice.domain.Department;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
