package com.vc.hr.payroll;

public class Address {
    private String street ;
    private String city ;
    private String province ;
    private String zipCode ;

    public Address(String st, String city, String pr, String zip) {
        this.street = st ;
        this.city = city ;
        this.province = pr ;
        this.zipCode = zip ;
    }

    public void printAddress() {
        System.out.println(
                "Street: " + this.street
                + "\nCity: " + this.city
                + "\nProvince: " + this.province
                + "\nZip: " + this.zipCode
        );
    }

    public String getAddress() {
        String address ;
        address = "Street: " + this.street
                + ", City: " + this.city
                + ", Province: " + this.province
                + ", Zip: " + this.zipCode + "\n" ;

        return address ;
    }
}
