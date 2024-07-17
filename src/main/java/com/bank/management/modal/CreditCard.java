package com.bank.management.modal;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.bank.management.enums.CardType;
import com.bank.management.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;


@Entity
@Data
public class CreditCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@OneToOne
	private User user;
	
	private String cardNo;
	
	private int cvv;
	
	private LocalDate expiryDate;
	
	private CardType cardType;
	
	private  LocalDate issueDate;
	
	private Status status;
	
	private String billingCycle;
	
	private int Pin;
	
	private BigDecimal creditLimit;
	
	private BigDecimal availableCredit;
	
	private BigDecimal minimumDue;
	
	private BigDecimal outstandingBalance;
	
	private BigDecimal interestRate;
	
	
	
}
