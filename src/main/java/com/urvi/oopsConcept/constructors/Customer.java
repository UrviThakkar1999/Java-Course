package com.urvi.oopsConcept.constructors;

public class Customer {

    private String CustomerName;
    private int CreditLimit;
    private String EmailAddress;

    public Customer(){

        this("Nobody",56000,"nobody1234@gmail.com");
        System.out.println("No arg Constructor");
        System.out.println("1");
    }


    public Customer(String CustomerName, String EmailAddress) {

        this(CustomerName,25000,EmailAddress);


        System.out.println("Constructor Chaining");
        System.out.println("2");
    }

    public Customer(String CustomerName, int CreditLimit, String EmailAddress) {

        this.CustomerName = CustomerName;
        this.CreditLimit = CreditLimit;
        this.EmailAddress = EmailAddress;
        System.out.println("Parameterized Constructor");


    }





    public String getCustomerName() {
        return CustomerName;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }
}
