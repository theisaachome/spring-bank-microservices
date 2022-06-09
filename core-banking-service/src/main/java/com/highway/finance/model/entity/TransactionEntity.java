package com.highway.finance.model.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.highway.finance.model.TransactionType;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@Entity
@Table(name = "banking_core_transaction")
public class TransactionEntity {

	private Long id;

	private BigDecimal amount;

	@Enumerated(EnumType.STRING)
	private TransactionType transactionType;

	private String referenceNumber;

	private String transactionId;

	@OneToOne(cascade = CascadeType.ALL)

	@JoinColumn(name = "account_id", referencedColumnName = "id")
	private BankAccountEntity account;
}
