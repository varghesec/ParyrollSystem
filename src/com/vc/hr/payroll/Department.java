package com.vc.hr.payroll;

import java.util.ArrayList;

public class Department {
    private final String departmentName ;
    private ArrayList<Employee> employeeList ;

    public Department(String name) {
        this.departmentName = name ;
    }

    public String getName(){
        return this.departmentName ;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList ;
    }
}
