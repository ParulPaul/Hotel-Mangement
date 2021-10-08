package com.techment.dto;

import java.util.Date;

public class BookingDetailsDto {

	int booking_id;

	Date booked_from;
	
	Date booked_to;
	
	int no_of_adults;
	
	int no_of_children;
	
	double amount;

	public BookingDetailsDto() {
		super();
	}

	public BookingDetailsDto(int booking_id, Date booked_from, Date booked_to, int no_of_adults, int no_of_children,
			double amount) {
		super();
		this.booking_id = booking_id;
		this.booked_from = booked_from;
		this.booked_to = booked_to;
		this.no_of_adults = no_of_adults;
		this.no_of_children = no_of_children;
		this.amount = amount;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public Date getBooked_from() {
		return booked_from;
	}

	public void setBooked_from(Date booked_from) {
		this.booked_from = booked_from;
	}

	public Date getBooked_to() {
		return booked_to;
	}

	public void setBooked_to(Date booked_to) {
		this.booked_to = booked_to;
	}

	public int getNo_of_adults() {
		return no_of_adults;
	}

	public void setNo_of_adults(int no_of_adults) {
		this.no_of_adults = no_of_adults;
	}

	public int getNo_of_children() {
		return no_of_children;
	}

	public void setNo_of_children(int no_of_children) {
		this.no_of_children = no_of_children;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BookingDetailsDto [booking_id=" + booking_id + ", booked_from=" + booked_from + ", booked_to="
				+ booked_to + ", no_of_adults=" + no_of_adults + ", no_of_children=" + no_of_children + ", amount="
				+ amount + "]";
	}
	
	
	
	
	
	
}
