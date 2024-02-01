package com.bms.BankingManagementSystem.repository;

import com.bms.BankingManagementSystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>
{
    @Transactional
    @Modifying
    @Query("DELETE FROM Customer c WHERE c.customerAccount = :accno")
    void deleteBycustomerAccount(@Param("accno") Long customerAccount);
}
