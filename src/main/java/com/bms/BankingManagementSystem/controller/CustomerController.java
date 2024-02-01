package com.bms.BankingManagementSystem.controller;

import com.bms.BankingManagementSystem.model.Bank;
import com.bms.BankingManagementSystem.model.Customer;
import com.bms.BankingManagementSystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController
{
    @Autowired
    private CustomerService customerService;

    @GetMapping("/getall")
    public List<Customer> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }
    @PostMapping("/customer/save")
    public void saveNewCustomer(@RequestBody Customer customer)

    {
        customerService.saveNewCustomer(customer);
    }
    @DeleteMapping("/customer/delete/accno/{accno}")
    public void deleteCustomerByAccNo(@PathVariable Long accno)
    {
        customerService.deleteCustomerByAccNo(accno);
    }

}
