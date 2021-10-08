package com.techment.dto;

public class TransactionsDto {

	
	int transaction_id;
	Double amount;
	public TransactionsDto(int transaction_id, Double amount) {
		super();
		this.transaction_id = transaction_id;
		this.amount = amount;
	}
	public TransactionsDto() {
		// TODO Auto-generated constructor stub
	}
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
	
	
}
