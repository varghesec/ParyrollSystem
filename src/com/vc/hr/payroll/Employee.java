package com.vc.hr.payroll;



public abstract class Employee implements IPayable {
    private String name ;
    private final int EMPLOYEE_ID ;
    private Address address ;
    private double payRate ;
    private static int nextID = 1000;
    public static double STARTING_PAY_RATE = 7.75 ;

    protected Department department ;
    private Company company ;

    public Employee(String name) {
        this.name = name ;
        EMPLOYEE_ID = getNextID() ;
        this.payRate = STARTING_PAY_RATE ;
    }

    public Employee(String name, Department department) {
        this.name = name ;
        EMPLOYEE_ID = getNextID() ;
        this.department = department ;
        this.payRate = STARTING_PAY_RATE ;
    }

    public Employee(String name, double pay) {
        this.name = name ;
        this.payRate = pay ;
        EMPLOYEE_ID = getNextID() ;
    }

    public String getName() {
        return this.name ;
    }

    public int getEmployeeID() {
        return EMPLOYEE_ID ;
    }

    public double getPayRate() {
        return this.payRate ;
    }

    public Department getDepartment() {
        return this.department ;
    }

    public void setName(String newName) {
        this.name = newName ;
    }

    public void changePayRate(double newRate) {
        this.payRate = newRate ;
    }

    public void setAddress(Address addr) {
        this.address = addr ;
    }

    public void setDepartment(Department department) {
        this.department = department ;
    }

    public void displayAddress() {
        this.address.printAddress() ;
    }

    public void setCompany(Company firm) {
        this.company = firm ;
    }

    public Company getCompany() {
        return this.company ;
    }

    public void setPayRate(double rate) {
        this.payRate = rate ;
    }

    public static int getNextID() {
        int id = nextID ;
        nextID++ ;
        return id ;
    }

    @Override
    public String toString(){
        return (this.name + " : " + this.getDepartment() ) ;
    }
}
