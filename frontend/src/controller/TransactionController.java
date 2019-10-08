package controller;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.*;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import model.Transaction;
import za.co.entities.*;
import za.co.services.*;



@ManagedBean(name="transcationcontroller")
@SessionScoped
public class TransactionController {
	
	@EJB
	private TransactionEJB transactionEJB;
	
	@ManagedProperty(value="#{transaction}")
	private Transaction transaction;
	
	private List<Transaction> transactionList = new ArrayList<>();
	
	public TransactionController() {
		this.transactionList = getTransactionList();
	}
	
	public List<Transaction> getTransactionList(){
		System.out.println("-----TransactionController Loading Transaction--------");
		transactionList = mapTransactions(transactionEJB.findTransactions());
		System.out.println("Transaction" + transactionList.toString());
		return transactionList;
	}
	
	public String viewTransaction () {	
		return "transactionList.xhtml";
	}
	
	public String addNewTransaction() {
		System.out.println("---Adding new transaction----");
		transactionEJB.addNew(transaction.getEntity());
		
		transactionEJB.findTransactions();
		return "transactionList.xhtml";
	}
	
	
	public Transaction getTransaction() {
		return transaction;
	}
	
	public void setTransaction( Transaction transaction) {
	 this.transaction = transaction;
	}
	
	private List<Transaction> mapTransactions(List<TransactionEntity> transactionEntity){
		List<Transaction> transactions = new ArrayList<>();
		for (TransactionEntity entity : transactionEntity) {
			Transaction transaction = new Transaction();
			transaction.setAccountNumber(entity.getAccountNumber());
			transaction.setAmount(entity.getAmount());
			transaction.setDestinationBank(entity.getDestinationBank());
			transaction.setDestinationCountry(entity.getDestinationCountry());
			transaction.setName(entity.getName());
			transaction.setSourcePassport(entity.getSourcePassport());	
		}
		return transactions;
	}
	
	}
	
	
	
	
