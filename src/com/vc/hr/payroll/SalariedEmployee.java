package com.vc.hr.payroll;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SalariedEmployee extends Employee{

    private double salary ;

    public SalariedEmployee(String name, Department department) {
        super(name, department);
    }

    public SalariedEmployee(String name, double sal) {
        super(name);
        this.salary = sal ;
    }

    @Override
    public double calculatePay() {
        return (this.salary - (this.salary * .3));
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
                "\n\t" + "Gross Salary: \t" + this.getSalary() +
                "\n\t" + "Net Salary: \t" + this.calculatePay() + "\n\n";

        return outStr;
    }

    public void setSalary(double sal) {
        this.salary = sal ;
    }

    public double getSalary() {
        return this.salary ;
    }

    public static void printStub(String filePath, List<SalariedEmployee> employees) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            for(SalariedEmployee employee: employees) {
                writer.write(employee.generatePayStub());
            }
        }
        catch(IOException ex) {
            System.out.println(" An error occurred printing pay stubs");
            ex.printStackTrace();
        }
    }
}
