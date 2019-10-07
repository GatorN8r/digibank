package model;

import java.io.Serializable;
import java.util.Date;

import javax.inject.Named;
import javax.enterprise.context.*;
import za.co.entities.*;
import jdk.jfr.Name;


@Name(value = "transaction")
@RequestScoped

public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long transactionCode;
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destinationCountry;
	private String accountNumber;
	private double amount;
	
	public Long getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(Long transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public TransactionEntity getEntity() {
		TransactionEntity transactionEntity = new TransactionEntity();
		transactionEntity.setTransactionCode(transactionCode);
		transactionEntity.setName(name);
		transactionEntity.setSourcePassport(sourcePassport);
		transactionEntity.setDestinationPassport(destinationPassport);
		transactionEntity.setDestinationBank(destinationBank);
		transactionEntity.setDestinationCountry(destinationCountry);
		transactionEntity.setAccountNumber(accountNumber);
		transactionEntity.setAmount(amount);
		return transactionEntity;
	}


	

}
