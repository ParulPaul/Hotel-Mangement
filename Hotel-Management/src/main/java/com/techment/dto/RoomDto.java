package com.techment.dto;

import java.sql.Blob;

public class RoomDto {

	
	int room_id;
	String room_no;
	String room_type;
	double rate_per_day;
	Boolean isavailable;
	Blob photo;
	
	
	public RoomDto() {
		super();
	}


	public RoomDto(int room_id, String room_no, String room_type, double rate_per_day, Boolean isavailable,
			Blob photo) {
		super();
		this.room_id = room_id;
		this.room_no = room_no;
		this.room_type = room_type;
		this.rate_per_day = rate_per_day;
		this.isavailable = isavailable;
		this.photo = photo;
	}


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


	public double getRate_per_day() {
		return rate_per_day;
	}


	public void setRate_per_day(double rate_per_day) {
		this.rate_per_day = rate_per_day;
	}


	public Boolean getIsavailable() {
		return isavailable;
	}


	public void setIsavailable(Boolean isavailable) {
		this.isavailable = isavailable;
	}


	public Blob getPhoto() {
		return photo;
	}


	public void setPhoto(Blob photo) {
		this.photo = photo;
	}


	@Override
	public String toString() {
		return "RoomDto [room_id=" + room_id + ", room_no=" + room_no + ", room_type=" + room_type + ", rate_per_day="
				+ rate_per_day + ", isavailable=" + isavailable + ", photo=" + photo + "]";
	}

	
	
}
