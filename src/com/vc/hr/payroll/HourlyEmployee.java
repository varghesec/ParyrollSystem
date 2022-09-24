package com.vc.hr.payroll;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourlyEmployee extends Employee{
    private float hoursWorked ; //has to be for month

    public HourlyEmployee(String name, Department department) {
        super(name, department);
    }

    public HourlyEmployee(String name, float hours) {
        super(name);
        this.hoursWorked = hours ;
    }

    @Override
    public double calculatePay() {
        return (this.hoursWorked * getPayRate());
    }

    @Override
    public String generatePayStub() {
        Date date = new Date() ;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy") ;
        String strDate = format.format(date) ;

        String outStr ;

        outStr ="\n\t\t" + this.getCompany().getCompanyName() + " - " + this.getCompany().getAddress() +
                "\n\t" + "Name: " + this.getName() + " - Employee ID: " + this.getEmployeeID() +
                "\n\t" + "Pay Date: \t\t" + strDate +
                "\n\t" + "Gross Salary: \t" + this.calculatePay() ;

        return outStr;
    }
}