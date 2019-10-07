package za.co.services;

import java.util.List;

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
		System.out.println("----------------------");
		System.out.println(transactionEntity.getName());
		em.persist(transactionEntity);
		System.out.println("----------------------");
	}
	
	public List<TransactionEntity> findTransactions(){
		System.out.println("loading all transactions");
		Query query = em.createQuery("FROM TransactionEntity");
		List<TransactionEntity> transaction = query.getResultList();
		return transaction;
	}
	

}
