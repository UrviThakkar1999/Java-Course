package com.urvi.oopsConcept.classes;

public class bankFunction {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.setAccountBalance(1000);
        bank.setAccountNumber("1234");
        bank.setCustomerEmail("demoCustomer@1234");
        bank.setCustomerName("demoCustomer");
        bank.setCustomerPhone(123456789);

        System.out.println("\n***Customer Info***");
        System.out.println("customer Name = "+bank.getCustomerName());
        System.out.println("customer Account Number = "+bank.getAccountNumber());
        System.out.println("customer Account Balance = "+bank.getAccountBalance());
        System.out.println("customer Email = "+bank.getCustomerEmail());
        System.out.println("customer Phone  = "+bank.getCustomerPhone());

        bank.deposit(3000);
        System.out.println("Customer Balance after deposite = "+bank.getAccountBalance());

        bank.withdraw(1000);
        System.out.println("Customer Balance = "+bank.getAccountBalance());
    }
}
