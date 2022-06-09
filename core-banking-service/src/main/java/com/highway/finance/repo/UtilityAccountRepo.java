package com.highway.finance.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highway.finance.model.entity.UtilityAccountEntity;

public interface UtilityAccountRepo extends JpaRepository<UtilityAccountEntity, Long>{
	 Optional<UtilityAccountEntity> findByProviderName(String provider);
}
