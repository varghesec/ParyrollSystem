package com.vc.hr.payroll;

public class Contractor implements IPayable{
    private float hoursWorked ;
    private double partCost ;
    private String contractorName ;

    public Contractor(String name, float hours, double cost) {
        this.contractorName = name ;
        this.hoursWorked = hours ;
        this.partCost = cost ;
    }
    @Override
    public double calculatePay() {
        return 0;
    }

    @Override
    public String generatePayStub() {
        //invoice generated for contractor
        return null;
    }
}
