package com.emplyee_management_system.Emplyee_Management_System.repository;

import com.emplyee_management_system.Emplyee_Management_System.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
