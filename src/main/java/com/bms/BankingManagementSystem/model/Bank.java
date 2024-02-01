package com.bms.BankingManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank
{
    @Id
    private String bankIFSC;
    private Long bankPinCode;
    private Long bankPhone;

    public Bank()
    {
    }

    public Bank(String bankIFSC, Long bankPinCode, Long bankPhone) {
        this.bankIFSC = bankIFSC;
        this.bankPinCode = bankPinCode;
        this.bankPhone = bankPhone;
    }

    public String getBankIFSC() {
        return bankIFSC;
    }

    public void setBankIFSC(String bankIFSC) {
        this.bankIFSC = bankIFSC;
    }

    public Long getBankPinCode() {
        return bankPinCode;
    }

    public void setBankPinCode(Long bankPinCode) {
        this.bankPinCode = bankPinCode;
    }

    public Long getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(Long bankPhone) {
        this.bankPhone = bankPhone;
    }
}
