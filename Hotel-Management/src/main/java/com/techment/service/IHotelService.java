package com.techment.service;

import java.util.List;

import com.techment.dto.HotelDto;




public interface IHotelService {

	String addHotel(HotelDto hoteldto);
	String updateHotel(HotelDto hoteldto,int id);
	String removeHotel(HotelDto hoteldto,int id);
	List<HotelDto> showAllHotels();
	HotelDto showHotelById(int id);

}


