package com.highway.finance.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highway.finance.model.entity.BankAccountEntity;

public interface BankAccountRepo extends JpaRepository<BankAccountEntity, Long> {

	Optional<BankAccountEntity> findByNumber(String accountNumber);
}
