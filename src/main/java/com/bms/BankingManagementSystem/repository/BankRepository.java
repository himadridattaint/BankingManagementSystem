package com.bms.BankingManagementSystem.repository;

import com.bms.BankingManagementSystem.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<Bank, String> {

    List<Bank> findBankBybankIFSC(String bankIFSC);

    List<Bank> findAllBybankPinCode(Long bankPinCode);

    List<Bank> findAllBybankPhone(Long bankPhone);
    @Transactional
    @Modifying
    @Query("DELETE FROM Bank b WHERE b.bankIFSC = :ifsc")
    void deleteByBankIFSC(@Param("ifsc") String bankIFSC);

    @Query("SELECT b.bankIFSC FROM Bank b WHERE b.bankPinCode = :pinCode AND b.bankIFSC IS NOT NULL")
    List<String> findAllBybankPinCodeAndbankIFSCIsNotNull(@Param("pinCode") Long bankPinCode);
    @Modifying
    @Transactional
    @Query("DELETE FROM Bank b WHERE b.bankPinCode = :pincode")
    void deleteAllByBankPinCode(@Param("pincode") Long bankPinCode);
}
