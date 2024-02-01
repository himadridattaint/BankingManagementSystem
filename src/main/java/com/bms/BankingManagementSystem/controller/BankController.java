package com.bms.BankingManagementSystem.controller;

import com.bms.BankingManagementSystem.model.Bank;
import com.bms.BankingManagementSystem.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bank")
public class BankController
{
    @Autowired
    private BankService bankService;
    @GetMapping("/getall")
    public List<Bank> getAllBank()
    {
        return bankService.getAllBank();
    }
    @GetMapping("/ifsc/{ifsc}")
    public List<Bank> getBankByIFSC(@PathVariable String ifsc)
    {
        return bankService.getBankByIFSC(ifsc);
    }
    @GetMapping("/pincode/{pincode}")
    public List<Bank> getBankByPinCode(@PathVariable Long pincode)
    {
        return bankService.getBankByPinCode(pincode);
    }
    @GetMapping("/phoneno/{phone}")
    public List<Bank> getBankByPhone(@PathVariable Long phone)
    {
        return bankService.getBankByPhone(phone);
    }
    @GetMapping("/getifscby/{pincode}")
    public List<String> getBankIFSCByPincode(@PathVariable Long pincode)
    {
        return bankService.getBankIFSCByPincode(pincode);
    }

    @PostMapping("/bank/save")
    public void saveNewBank(@RequestBody Bank bank)
    {
        bankService.saveNewBank(bank);
    }
    @DeleteMapping("/delete/ifsc/{ifsc}")
    public void deleteBankByIFSC(@PathVariable String ifsc)
    {
        bankService.deleteBankByIFSC(ifsc);
    }
    @DeleteMapping("/delete/pincode/{pincode}")
    public void deleteBankByPinCode(@PathVariable Long pincode)
    {
        bankService.deleteBankByPinCode(pincode);
    }

}
