package com.bms.BankingManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer
{
    @Id
    private Long customerAccount;
    private String customerName;
    private String customerAddress;
    @ManyToOne
    private Bank bank;

    public Long getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(Long customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Customer() {
    }

    public Customer(Long customerAccount, String customerName, String customerAddress, Bank bank) {
        this.customerAccount = customerAccount;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.bank = bank;
    }
}
