package com.example.EmployeeApi.Repository;

import com.example.EmployeeApi.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
