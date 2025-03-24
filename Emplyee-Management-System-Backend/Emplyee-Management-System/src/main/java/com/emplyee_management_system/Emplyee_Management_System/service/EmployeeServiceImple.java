package com.emplyee_management_system.Emplyee_Management_System.service;

import com.emplyee_management_system.Emplyee_Management_System.entity.Employee;
import com.emplyee_management_system.Emplyee_Management_System.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImple implements EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImple(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(int id) {

        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee addEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(int empId, Employee employee) {
        Employee existingEmp = employeeRepository.findById(empId)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + empId));

        // Update only necessary fields
        existingEmp.setEmpName(employee.getEmpName());
        existingEmp.setEmpEmail(employee.getEmpEmail());
        existingEmp.setEmpAddress(employee.getEmpAddress());
        existingEmp.setEmpSalary(employee.getEmpSalary());

        return employeeRepository.save(existingEmp);
    }

    @Override
    public String deleteEmployee(int id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));

        employeeRepository.delete(employee);

        return "Employee with ID " + id + " deleted successfully.";
    }

}
