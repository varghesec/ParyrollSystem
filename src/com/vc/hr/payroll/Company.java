package com.vc.hr.payroll;

import java.util.List;

public class Company {
    private String name ;
    private Address address ;
    private List<Department> departments ;

    public Company(String name, Address addr) {
        this.name = name ;
        this.address = addr ;
    }

    public String getCompanyName() {
        return this.name ;
    }

    public List<Department> getDepartmentList() {
        return this.departments ;
    }

    public String getAddress() {
        return this.address.getAddress() ;
    }

    public void displayAddress() {
        this.address.printAddress();
    }
}
