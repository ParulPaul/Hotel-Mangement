package com.techment.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.BookingDetailsDto;

import com.techment.entity.BookingDetails;
import com.techment.exception.IDNotFoundException;
import com.techment.service.IBookingDetailsService;

@RestController
@RequestMapping(value="bookingDetailsController")
public class BookingDetailsController {
	
	
	@Autowired
	IBookingDetailsService bookingDetailsService;
	
	
	@PostMapping(value="/addBookingDetails")
	public ResponseEntity<String> addbookingDetails(@RequestBody BookingDetailsDto bookingdetailDto){
	
		bookingDetailsService.addBookingDetails(bookingdetailDto);
		return new ResponseEntity<String>("Booking Details added", HttpStatus.OK);
	}
	
	
	@PutMapping("/updateBookingDetails/{id}")
	public ResponseEntity<String>  viewBookingDetailsById(@PathVariable int id,@RequestBody BookingDetails bookingDetails)
	{
			BookingDetailsDto bookingdetailUpdate = bookingDetailsService.updateBookingDetails(id);
			
			bookingDetails.setBooking_id(bookingDetails.getBooking_id());
			bookingDetails.setBooked_from(bookingDetails.getBooked_from());
			bookingDetails.setBooked_to(bookingDetails.getBooked_to());
			bookingDetails.setNo_of_adults(bookingDetails.getNo_of_adults());
			bookingDetails.setNo_of_children(bookingDetails.getNo_of_children());
			bookingDetails.setAmount(bookingDetails.getAmount());
			
		    bookingDetailsService.addBookingDetails(bookingdetailUpdate);
		
			
			
			return new ResponseEntity<String>("Details Updated",HttpStatus.ACCEPTED);	
	}
	
	@GetMapping(value = "/showAllBookingDetails")
	public ResponseEntity<List<BookingDetailsDto>> viewAllBookingDetails(){
		return new ResponseEntity<List<BookingDetailsDto>>(bookingDetailsService.showAllBookingDetails(), HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping(value = "/showBookingDetailsById/{id}")
	public BookingDetailsDto getBookingDetailById(@PathVariable int id)
	{
		return bookingDetailsService.showBookingDetailsById(id);
	}
	
	@DeleteMapping(value = "/removeBookingDetailById/{id}")
	public ResponseEntity<String> deleteBookingById(@PathVariable int id)
	{
		bookingDetailsService.removeBookingDetails(id);

		return new ResponseEntity<String>("Details Deleted",HttpStatus.ACCEPTED);
	}

}
