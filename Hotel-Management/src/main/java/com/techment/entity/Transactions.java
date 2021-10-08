package com.techment.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

/****
 * This is the Transaction POJO class
 * Contains data-members
 */



@Entity
@Table(name = "Transactions")
public class Transactions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int transaction_id;
	
	
	Double amount;
	
	
	/**
	 * Default Constructor
	 * */
	
	public Transactions() {
		super();
	}



	/***
	 * Parameterized Constructor
	 * 
	 * **/
	
	public Transactions(int transaction_id, Double amount) {
		super();
		this.transaction_id = transaction_id;
		this.amount = amount;
	}


	/*****
	 * 
	 *Getter and setters 
	 */
	
	public int getTransaction_id() {
		return transaction_id;
	}



	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}



	public Double getAmount() {
		return amount;
	}



	public void setAmount(Double amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Transactions [transaction_id=" + transaction_id + ", amount=" + amount + "]";
	}

	
}
