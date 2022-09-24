package com.vc.hr.payroll;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        SalariedEmployee bob = new SalariedEmployee("Robert Dutile", 250000) ;
        System.out.println(bob.calculatePay());
        Address addr = new Address("No. 5 Lincoln St", "New Haven", "New England", "10132");
        bob.setAddress(addr) ;
        Address ustAddr = new Address("5 Polaris Way", "Aliso Viejo", "Orange County", "92565") ;
        Company ust = new Company("UST", ustAddr) ;
        bob.setCompany(ust) ;
        //String payStu = bob.generatePayStub() ;
        //System.out.println(payStu);

        SalariedEmployee varghese = new SalariedEmployee("Varghese Cherian", 80000);
        varghese.setCompany(ust);
        Address vargAddr = new Address("TC 15/3297", "Marappalam", "Kerala", "695004");
        varghese.setAddress(vargAddr);

        SalariedEmployee saju = new SalariedEmployee("Saju Mathew", 75000);
        saju.setCompany(ust);
        Address sajuAddr = new Address("TC 4/3684", "Trivandrum", "Kerala", "695005");
        saju.setAddress(sajuAddr);

        String fileName = "PayStub.txt";

        List<SalariedEmployee> salaried = new ArrayList<>();
        salaried.add(bob);
        salaried.add(varghese);
        salaried.add(saju);
        SalariedEmployee.printStub(fileName, salaried);

        HourlyEmployee vinu = new HourlyEmployee("Vinu Cherian", 191f);
        vinu.setPayRate(120);
        System.out.println(vinu.calculatePay());        Contractor joe = new Contractor("Joe's Plumbing", 9f, 335.8);
    }
}