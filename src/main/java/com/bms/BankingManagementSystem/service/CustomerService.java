package com.bms.BankingManagementSystem.service;

import com.bms.BankingManagementSystem.model.Bank;
import com.bms.BankingManagementSystem.model.Customer;
import com.bms.BankingManagementSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService
{
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> getAllCustomer()
    {
        return customerRepository.findAll();
    }
    public void saveNewCustomer(Customer customer)
    {
        customerRepository.save(customer);
    }
    public void deleteCustomerByAccNo(Long accno)
    {
        customerRepository.deleteBycustomerAccount(accno);
    }
}
