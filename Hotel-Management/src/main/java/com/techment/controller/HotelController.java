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
import com.techment.dto.HotelDto;
import com.techment.dto.UserDto;
import com.techment.entity.BookingDetails;
import com.techment.entity.Hotel;
import com.techment.exception.HotelException;
import com.techment.exception.IDNotFoundException;
import com.techment.service.IHotelService;

@RestController
@RequestMapping(value="hotelController")
public class HotelController {

	
	@Autowired
	IHotelService hotelService;
	
	

	@PostMapping(value="/addHotel")
	public ResponseEntity<String> addHotelDetails(@RequestBody HotelDto hoteldto){
		
		
	    try {
			
				return new ResponseEntity<String>(hotelService.addHotel(hoteldto), HttpStatus.ACCEPTED);
			}
			
			catch (NoSuchElementException e)
			{
				throw new IDNotFoundException("something went wrong while adding hotel");
			}
			
		

//		hotelService.addHotel(hoteldto);
//		return new ResponseEntity<String>("Hotels are added", HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateHotel")
	public ResponseEntity<String> updateHotelDetails(@RequestBody HotelDto hoteldto,@PathVariable int id)
	{
		 try {
				
				return new ResponseEntity<String>(hotelService.updateHotel(hoteldto, id), HttpStatus.ACCEPTED);
			}
			
			catch (NoSuchElementException e)
			{
				throw new IDNotFoundException("no such data(id) is present ");
			}
			
		

//	    hotelService.updateHotel(hoteldto,id);
//		return new ResponseEntity<String>("Hotel Details Updated...",HttpStatus.ACCEPTED);
	}
	

	@DeleteMapping(value = "/removeHotel")
	public ResponseEntity<String> removeHotels(@RequestBody HotelDto hoteldto,@PathVariable int id)
	{
	    try {
			
				return new ResponseEntity<String>(hotelService.removeHotel(hoteldto, id), HttpStatus.ACCEPTED);
			}
			
			catch (NoSuchElementException e)
			{
				throw new IDNotFoundException("no such data is present ");
			}
		
//		hotelService.removeHotel(hoteldto, id);
//		return new ResponseEntity<String>("Hotel Deleted",HttpStatus.ACCEPTED);
	}
	
	@GetMapping(value = "/showAllHotels")
	public ResponseEntity<List<HotelDto>> viewAllHotel(){
		
try {
			
			return new ResponseEntity<List<HotelDto>>(hotelService.showAllHotels(), HttpStatus.ACCEPTED);
		}
		
		catch (NoSuchElementException e)
		{
			throw new HotelException("no such data is present ");
		}
		
		
		//return new ResponseEntity<List<HotelDto>>(hotelService.showAllHotels(), HttpStatus.ACCEPTED);
		
	}

	@GetMapping(value = "/showHotelById/{id}")
	public HotelDto showHotel(@PathVariable int id)
	{

		return hotelService.showHotelById(id);
	}
	

//	@PostMapping(value="/addHotel")
//	public ResponseEntity<String> addHotelDetails(@PathVariable Hotel hotel){
//		hotelService.addHotel(hotel);
//		return new ResponseEntity<String>("Hotels are added", HttpStatus.OK);
//	}
//	
//	@PutMapping(value = "/updateHotel")
//	public ResponseEntity<String> updateHotelDetails(@RequestBody Hotel hotel)
//	{
//		String hotelDetail = hotelService.updateHotel(hotel);
//	    hotelService.addHotel(hotel);
//	
//		
//		return new ResponseEntity<String>("Hotel Details Updated...",HttpStatus.ACCEPTED);
//	}
//	
//	@DeleteMapping(value = "/removeHotel")
//	public ResponseEntity<String> removeHotels(@PathVariable Hotel hotel)
//	{
//		hotelService.removeHotel(hotel);
//		return new ResponseEntity<String>("Hotel Deleted",HttpStatus.ACCEPTED);
//	}
//	
//	@GetMapping(value = "/showAllHotels")
//	public ResponseEntity<List<Hotel>> viewAllHotel(){
//		return new ResponseEntity<List<Hotel>>(hotelService.showAllHotels(), HttpStatus.ACCEPTED);
//		
//	}
//	
//	
//
//	@GetMapping(value = "/showHotelById/{id}")
//	public Hotel showHotel(@PathVariable int id)
//	{
//		return hotelService.showHotelById(id);
//	}
}
