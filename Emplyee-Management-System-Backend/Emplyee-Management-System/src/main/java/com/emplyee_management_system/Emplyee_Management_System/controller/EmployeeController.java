package com.emplyee_management_system.Emplyee_Management_System.controller;

import com.emplyee_management_system.Emplyee_Management_System.entity.Employee;
import com.emplyee_management_system.Emplyee_Management_System.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // ✅ Get all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // ✅ Get a single employee by ID
    @GetMapping("/{empId}")
    public Employee getEmployee(@PathVariable int empId) {
        return employeeService.getEmployee(empId);
    }

    // ✅ Add a new employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    // ✅ Update employee
    @PutMapping("/{empId}")
    public Employee updateEmployee(@PathVariable int empId, @RequestBody Employee employee) {
        return employeeService.updateEmployee(empId, employee);
    }

    // ✅ Delete employee
    @DeleteMapping("/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int empId) {  // 👈 Fixed @PathVariable
        employeeService.deleteEmployee(empId);
        return ResponseEntity.ok("Employee deleted successfully.");
    }
}
