package com.urvi.oopsConcept.constructors;

public class CustomerDemo {

    public static void main(String[] args) {

        Customer customer = new Customer("Urvi",100000,"urvithakkar21@gmail.com");

        System.out.println("\n***Customer Info***");
        System.out.println("customer Name = "+customer.getCustomerName());
        System.out.println("customer credit limit = "+customer.getCreditLimit());
        System.out.println("custom email address = "+customer.getEmailAddress());
        System.out.println("*************************************************");

        System.out.println("\nconstructor Chaining ****");
        Customer c = new Customer();
        System.out.println("customer Name = "+c.getCustomerName());
        System.out.println("customer credit limit = "+c.getCreditLimit());
        System.out.println("custom email address = "+c.getEmailAddress());

        System.out.println("*************************************************");
        Customer cus = new Customer("Urr","urmi1234@gmail.com");
        System.out.println("customer Name = "+cus.getCustomerName());
        System.out.println("customer credit limit = "+cus.getCreditLimit());
        System.out.println("custom email address = "+cus.getEmailAddress());

    }

}
