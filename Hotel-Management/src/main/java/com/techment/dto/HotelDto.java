package com.techment.dto;

import org.springframework.http.HttpStatus;

public class HotelDto {

int hotel_id;
	
	String hotel_city;
	
	String hotel_name;
	
	String hotel_address;
	
	String hotel_description;
	
	Double avg_rate_per_day;
	
	String hotel_email;
	
	String hotel_phone1;
	
	String hotel_phone2;
	
	String hotel_website;

	public HotelDto(int hotel_id, Double  avg_rate_per_day, String hotel_city, String hotel_home,
			String hotel_address, String hotel_email, String hotel_phone1, String  hotel_phone2, String  hotel_website, 
			String  hotel_description) {
		super();
	}

	public HotelDto(int hotel_id, String hotel_city, String hotel_name, String hotel_address, String hotel_description,
			Double avg_rate_per_day, String hotel_email, String hotel_phone1, String hotel_phone2,
			String hotel_website) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_city = hotel_city;
		this.hotel_name = hotel_name;
		this.hotel_address = hotel_address;
		this.hotel_description = hotel_description;
		this.avg_rate_per_day = avg_rate_per_day;
		this.hotel_email = hotel_email;
		this.hotel_phone1 = hotel_phone1;
		this.hotel_phone2 = hotel_phone2;
		this.hotel_website = hotel_website;
	}

	public HotelDto(HotelDto showHotelById, HttpStatus ok) {
		// TODO Auto-generated constructor stub
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public String getHotel_city() {
		return hotel_city;
	}

	public void setHotel_city(String hotel_city) {
		this.hotel_city = hotel_city;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public String getHotel_address() {
		return hotel_address;
	}

	public void setHotel_address(String hotel_address) {
		this.hotel_address = hotel_address;
	}

	public String getHotel_description() {
		return hotel_description;
	}

	public void setHotel_description(String hotel_description) {
		this.hotel_description = hotel_description;
	}

	public Double getAvg_rate_per_day() {
		return avg_rate_per_day;
	}

	public void setAvg_rate_per_day(Double avg_rate_per_day) {
		this.avg_rate_per_day = avg_rate_per_day;
	}

	public String getHotel_email() {
		return hotel_email;
	}

	public void setHotel_email(String hotel_email) {
		this.hotel_email = hotel_email;
	}

	public String getHotel_phone1() {
		return hotel_phone1;
	}

	public void setHotel_phone1(String hotel_phone1) {
		this.hotel_phone1 = hotel_phone1;
	}

	public String getHotel_phone2() {
		return hotel_phone2;
	}

	public void setHotel_phone2(String hotel_phone2) {
		this.hotel_phone2 = hotel_phone2;
	}

	public String getHotel_website() {
		return hotel_website;
	}

	public void setHotel_website(String hotel_website) {
		this.hotel_website = hotel_website;
	}

	@Override
	public String toString() {
		return "HotelDto [hotel_id=" + hotel_id + ", hotel_city=" + hotel_city + ", hotel_name=" + hotel_name
				+ ", hotel_address=" + hotel_address + ", hotel_description=" + hotel_description
				+ ", avg_rate_per_day=" + avg_rate_per_day + ", hotel_email=" + hotel_email + ", hotel_phone1="
				+ hotel_phone1 + ", hotel_phone2=" + hotel_phone2 + ", hotel_website=" + hotel_website + "]";
	}
	
	
	
}
