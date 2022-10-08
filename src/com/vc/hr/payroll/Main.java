package com.vc.hr.payroll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.util.Map;
import java.util.stream.Collectors;

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



        Department admin = new Department("Operations") ;
        Department finance = new Department("Finance") ;
        Department legal = new Department("Legal and Compliance") ;
        Department services = new Department("Services & Solutions") ;

        ArrayList<Department> departments = new ArrayList<>() ;
        departments.add(admin) ;
        departments.add(finance) ;
        departments.add(legal) ;
        departments.add(services) ;

        bob.setDepartment(legal);
        saju.setDepartment(finance);
        varghese.setDepartment(services);

        SalariedEmployee padman = new SalariedEmployee("Padmanabhan", finance) ;
        SalariedEmployee laura = new SalariedEmployee("Laura", legal) ;
        SalariedEmployee cj = new SalariedEmployee("Jayaraj", services) ;

        Employee[] employees = {bob, saju, varghese, padman, laura, cj} ;
        List<Employee> employeeList = Arrays.asList(employees) ;

        employeeList.stream().forEach(System.out::println);

        bob.toString() ;
        System.out.println("Employees group by Department");

        Map<Department, List<Employee>> groupedByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)) ;
        groupedByDepartment.forEach((department, employeesInDepartment) -> {
            System.out.println(department.getName());
            employeesInDepartment.forEach((employee) -> System.out.printf(" %s%n", employee.getName())) ;
        });


        SalariedEmployee.printStub(fileName, salaried);

        HourlyEmployee vinu = new HourlyEmployee("Vinu Cherian", 191f);
        vinu.setPayRate(120);
        System.out.println(vinu.calculatePay());        Contractor joe = new Contractor("Joe's Plumbing", 9f, 335.8);
    }
}