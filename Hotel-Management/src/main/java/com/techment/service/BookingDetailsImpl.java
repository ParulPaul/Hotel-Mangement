package com.techment.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IBookingDetailsDao;
import com.techment.dto.BookingDetailsDto;

import com.techment.entity.BookingDetails;


@Service
public class BookingDetailsImpl implements IBookingDetailsService{
	
	
	 	@Autowired
		IBookingDetailsDao bookingDetailsDao;


	@Override
	public String addBookingDetails(BookingDetailsDto bookingDetailsDto) {
		
		BookingDetails bookingDetails = new BookingDetails(bookingDetailsDto.getBooking_id(),bookingDetailsDto.getBooked_from(),bookingDetailsDto.getBooked_to()
    ,bookingDetailsDto.getNo_of_adults(), bookingDetailsDto.getNo_of_children(),bookingDetailsDto.getAmount());
		
		bookingDetailsDao.save(bookingDetails);
		return "Booking Details added";

	}



	@Override
	public BookingDetailsDto updateBookingDetails(int id) {
		BookingDetails existingdetails = bookingDetailsDao.findById(id).get();
		BookingDetailsDto bookingDetailsDto = new BookingDetailsDto(existingdetails.getBooking_id(),existingdetails.getBooked_from(),
		existingdetails.getBooked_to(),existingdetails.getNo_of_adults(),existingdetails.getNo_of_children(),existingdetails.getAmount());
		return bookingDetailsDto;
	}



	@Override
	public String removeBookingDetails(int id) {
		bookingDetailsDao.deleteById(id);
		return "Details Deleted";
	}



	@Override
	public BookingDetailsDto showBookingDetailsById(int id) {

		BookingDetails bookingdetail = bookingDetailsDao.findById(id).get();
		BookingDetailsDto bookingDetailsDto =new BookingDetailsDto(bookingdetail.getBooking_id(),bookingdetail.getBooked_from(),
				bookingdetail.getBooked_to(),bookingdetail.getNo_of_adults(),bookingdetail.getNo_of_children(),bookingdetail.getAmount());
		
	    return bookingDetailsDto;
	}



	@Override
	public List<BookingDetailsDto> showAllBookingDetails() {
	
		List<BookingDetails> bookingdetails = bookingDetailsDao.findAll();
		List <BookingDetailsDto>  detailDto = new ArrayList<BookingDetailsDto>();
		
		for (BookingDetails detail : bookingdetails) {
			
			detailDto.add(new BookingDetailsDto(detail.getBooking_id(),detail.getBooked_from(),
					detail.getBooked_to(),detail.getNo_of_adults(),detail.getNo_of_children(), detail.getAmount()));
		}
		return detailDto;
	}


	
}
