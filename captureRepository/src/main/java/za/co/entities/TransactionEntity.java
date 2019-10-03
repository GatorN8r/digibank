package za.co.entities;

import javax.persistence.*;


@Entity
@Table (name="transaction_tbl")
public class TransactionEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable =false, unique=true, insertable=false, updatable=false)
	private Long id;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transactionCode", insertable = false, nullable = false, unique = true, updatable = false )
	private Long transactionCode;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="sourcepassport")
	private String sourcePassport;
	
	@Column(name ="destinationpassport")
	private String destinationPassport;
	
	@Column(name = "destinationbank")
	private String destinationBank;
	
	@Column(name = "destinationcountry")
	private String destinationCountry;
	
	@Column(name = "accountnumber")
	private String accountNumber;
	
	@Column(name= "amount")
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
	

}
