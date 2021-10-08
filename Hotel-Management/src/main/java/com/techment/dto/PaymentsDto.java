package com.techment.dto;

import com.techment.entity.Payments;

public class PaymentsDto {
	
	
	private Payments payments;
	int payment_id;
	int booking_id;
	int transaction_id;
	public PaymentsDto() {
		super();
	}
	public PaymentsDto(Payments payments, int payment_id, int booking_id, int transaction_id) {
		super();
		this.payments = payments;
		this.payment_id = payment_id;
		this.booking_id = booking_id;
		this.transaction_id = transaction_id;
	}
	public Payments getPayments() {
		return payments;
	}
	public void setPayments(Payments payments) {
		this.payments = payments;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	

}
