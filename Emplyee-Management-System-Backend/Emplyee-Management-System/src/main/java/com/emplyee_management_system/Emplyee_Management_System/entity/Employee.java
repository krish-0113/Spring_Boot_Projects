package com.emplyee_management_system.Emplyee_Management_System.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int empId;

    @Column
    private String empName;

    @Column
    private String empEmail;

    @Column
    private String empAddress;

    @Column
    private int empSalary;

    public Employee() {

    }
    public Employee(int empId, String empName, String empEmail, String empAddress, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}
