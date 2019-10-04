package controller;

import entities.TransactionEntity;
import model.Transaction;
import service.TransactionEJB;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.ejb.EJB;
import javax.enterprise.context.*;
import entities.TransactionEntity;

import jdk.jfr.Name;
import javax.inject.Named;


@Name(value = "transactionController")
@SessionScoped
public class TransactionController {
	
	@EJB
	private TransactionEJB transactionEJB;
	
	@ManagedProperty(value ="#{transaction}")
	private Transaction transaction;

}
