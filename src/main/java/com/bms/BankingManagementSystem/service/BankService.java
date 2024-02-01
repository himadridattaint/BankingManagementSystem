package com.bms.BankingManagementSystem.service;

import com.bms.BankingManagementSystem.model.Bank;
import com.bms.BankingManagementSystem.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service

public class BankService
{
    @Autowired
    private BankRepository bankRepository;



    public List<Bank> getAllBank()
    {
        return bankRepository.findAll();
    }
    public void saveNewBank(Bank bank)
    {
        bankRepository.save(bank);
    }
    public List<Bank> getBankByIFSC(String ifsc)
    {
        return bankRepository.findBankBybankIFSC(ifsc);
    }
    public List<Bank> getBankByPinCode(Long pincode)
    {
        return bankRepository.findAllBybankPinCode(pincode);
    }
    public List<Bank> getBankByPhone(Long phone)
    {
        return bankRepository.findAllBybankPhone(phone);
    }
    public List<String> getBankIFSCByPincode(Long pincode)
    {
        return bankRepository.findAllBybankPinCodeAndbankIFSCIsNotNull(pincode);
    }
    public void deleteBankByIFSC(String ifsc)
    {
        bankRepository.deleteByBankIFSC(ifsc);
    }
    public void deleteBankByPinCode(Long pincode)
    {
        bankRepository.deleteAllByBankPinCode(pincode);
    }
}
