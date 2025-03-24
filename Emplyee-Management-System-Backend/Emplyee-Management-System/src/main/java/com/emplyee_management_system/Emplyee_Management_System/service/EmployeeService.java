package com.emplyee_management_system.Emplyee_Management_System.service;

import com.emplyee_management_system.Emplyee_Management_System.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployee(int empId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(int empId, Employee employee);
    String deleteEmployee(int empId);
}
