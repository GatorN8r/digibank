package za.co.services;

import javax.ejb.*;
import javax.persistence.*;

import za.co.entities.TransactionEntity;

@Stateless
@LocalBean
public class TransactionEJB {
	
	@PersistenceContext
	private EntityManager em;
	
	public TransactionEJB () {}
	
	public void addNew (TransactionEntity transactionEntity) {
		TransactionEntity transaction = new TransactionEntity();
		
	}
	

}
