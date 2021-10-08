package com.techment.entity;


import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

/***
 * This is the POJO class of Booking Details
 * Containing data-members
 * */


@Entity
@Table(name = "Booking")
public class BookingDetails  {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int booking_id;
	
	
	Date booked_from;
	
	Date booked_to;
	
	int no_of_adults;
	
	int no_of_children;
	
	double amount;
	
	
	/****
	 * Default Constructor
	 */
	
	
	public BookingDetails() {
		super();
	}



	/**
	 * Parameterized Constructor
	 * **/


	public BookingDetails(int booking_id, Date booked_from, Date booked_to, int no_of_adults, int no_of_children,
			double amount) {
		super();
		this.booking_id = booking_id;
		this.booked_from = booked_from;
		this.booked_to = booked_to;
		this.no_of_adults = no_of_adults;
		this.no_of_children = no_of_children;
		this.amount = amount;
	}





	/***
	 * Getter and Setters
	 */
	
	
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


	/***
	 * toString methods
	 * */



	@Override
	public String toString() {
		return "BookingDetails [booking_id=" + booking_id + ", booked_from=" + booked_from + ", booked_to=" + booked_to
				+ ", no_of_adults=" + no_of_adults + ", no_of_children=" + no_of_children + ", amount=" + amount + "]";
	}


	@OneToOne()
	@JoinColumn(name="userid", referencedColumnName = "user_id")
	private Users user;

	@OneToOne()
	@JoinColumn(name="hotelid", referencedColumnName = "hotel_id")
    private Hotel hotel;

}