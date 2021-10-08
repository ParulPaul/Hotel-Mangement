package com.techment.entity;

import java.sql.Blob;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This is POJO classes for Room Details
 * Containing data-members
 * */



@Entity
@Table(name = "RoomDetails")
public class RoomDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int room_id;
	String room_no;
	
	String room_type;
	
	Double rate_per_day;
	
	Boolean isAvailable;
	
	Blob photo;

	/*
	 * Default Constructor
	 * ***/
	
	public RoomDetails() {
		super();
	}


	
	/**
	 * Parameterized Constructor
	 * */
	
	public RoomDetails(int room_id, String room_name, String room_type, Double rate_per_day,
			Boolean isAvailable, Blob photo) {
		super();
		this.room_id = room_id;
		this.room_type = room_type;
		this.rate_per_day = rate_per_day;
		this.isAvailable = isAvailable;
		this.photo = photo;
	}



	/****
	 * Getter and Setters 
	 */
	

	public int getRoom_id() {
		return room_id;
	}



	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}



	public String getRoom_no() {
		return room_no;
	}



	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}



	public String getRoom_type() {
		return room_type;
	}



	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}



	public Double getRate_per_day() {
		return rate_per_day;
	}



	public void setRate_per_day(Double rate_per_day) {
		this.rate_per_day = rate_per_day;
	}



	public Boolean getIsAvailable() {
		return isAvailable;
	}



	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}



	public Blob getPhoto() {
		return photo;
	}



	public void setPhoto(Blob photo) {
		this.photo = photo;
	}




	
	/***
	 * toString Methods
	 * */
	
	@Override
	public String toString() {
		return "RoomDetails [room_id=" + room_id + ", room_no=" + room_no + ", room_type=" + room_type
				+ ", rate_per_day=" + rate_per_day + ", isAvailable=" + isAvailable + ", photo=" + photo + "]";
	}
	

	
}
