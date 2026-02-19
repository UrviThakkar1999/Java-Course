package com.urvi.oopsConcept.classes;

public class Bank {

    private String AccountNumber;
    private int AccountBalance;
    private String CustomerName;
    private  String CustomerEmail;
    private int CustomerPhone;

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        AccountBalance = accountBalance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public int getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(int customerPhone) {
        CustomerPhone = customerPhone;
    }


    public void deposit(int amount) {
        AccountBalance = AccountBalance + amount;
        System.out.println("You have successfully deposited " + amount);
    }
    public void withdraw(int amount) {

        if (AccountBalance >= amount) {
            AccountBalance=AccountBalance-amount;
            System.out.println("You have successfully withdraw " + amount);
        }else  {
            System.out.println("Cannot be withdrawn as the withdrawl amount is greater than the Account Balance");
        }


    }

}


