package com.techment.service;

import java.util.List;

import com.techment.dto.BookingDetailsDto;




public interface IBookingDetailsService {

	
	String addBookingDetails(BookingDetailsDto bookingDetailsDto);
	BookingDetailsDto updateBookingDetails(int id);
	String removeBookingDetails(int id);
	BookingDetailsDto showBookingDetailsById(int id);
	List<BookingDetailsDto> showAllBookingDetails();
}
