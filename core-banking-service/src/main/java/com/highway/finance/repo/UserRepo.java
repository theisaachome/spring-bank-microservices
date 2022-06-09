package com.highway.finance.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.highway.finance.model.entity.UserEntity;

public interface UserRepo  extends JpaRepository<UserEntity, Long>{
    Optional<UserEntity> findByIdentificationNumber(String identificationNumber);

}
