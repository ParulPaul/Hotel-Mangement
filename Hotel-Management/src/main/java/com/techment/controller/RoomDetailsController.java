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

import com.techment.dto.RoomDto;
import com.techment.exception.IDNotFoundException;
import com.techment.exception.RoomDetailsException;
import com.techment.service.IRoomDetailsService;

@RestController
@RequestMapping(value = "/roomController")
public class RoomDetailsController {
	
	
	@Autowired
	private IRoomDetailsService iRoomDetails;
	
	@PostMapping(value = "/addRooms")
	public ResponseEntity<String> addRooms(@RequestBody RoomDto roomDetails) {
		
		
	    try {
				
				return new ResponseEntity<String>(iRoomDetails.addRoomDetails(roomDetails), HttpStatus.ACCEPTED);
			}
			
			catch (NoSuchElementException e)
			{
				throw new RoomDetailsException("something went wrong while adding room");
			}
	
	
		
//		iRoomDetails.addRoomDetails(roomDetails);
//		return new ResponseEntity<String>("Rooms added", HttpStatus.OK);
	}
	
	@GetMapping(value = "/viewAllRooms")
	public ResponseEntity<List<RoomDto>> viewAllRooms() {
		
		
	    try {
				
	    	return new ResponseEntity<List<RoomDto>>(iRoomDetails.viewAllRoomDetails(), HttpStatus.ACCEPTED);
			}
			
			catch (NoSuchElementException e)
			{
				throw new RoomDetailsException("something went wrong while viewing all rooms");
			}
	
		
//		return new ResponseEntity<List<RoomDto>>(iRoomDetails.viewAllRoomDetails(), HttpStatus.ACCEPTED);
	}
	
	@PutMapping(value = "/updateRoomById/{id}")
	public ResponseEntity<String> updateRoomById(@PathVariable int id,@RequestBody RoomDto room)
	{
		
try {
			
	    	return new ResponseEntity<String>(iRoomDetails.updateRoomDetails(room, id), HttpStatus.ACCEPTED);
			}
			
			catch (NoSuchElementException e)
			{
				throw new IDNotFoundException("something went wrong while looking for id ");
			}
		
	
	
		
		//room.setRoom_id(id);
//		iRoomDetails.addRoomDetails(room);
//		
//		return new ResponseEntity<String>("User Updated",HttpStatus.ACCEPTED);
	}
	
	
//	
//	
//	@GetMapping(value = "/viewRoomById/{id}")
//	public ResponseEntity<String> getRoomById(@PathVariable int id)
//	{
////		return iRoomDetails.showRoomDetails(id);
//		try {
//			
//	    	return new ResponseEntity<String>(iRoomDetails.showRoomDetails(id), HttpStatus.ACCEPTED);
//			}
//			
//			catch (NoSuchElementException e)
//			{
//				throw new IDNotFoundException("something went wrong while looking for id");
//			}
//	}

	@GetMapping(value = "/viewRoomById/{id}")
	public RoomDto getRoomById(@PathVariable int id)
	
	{
	
		return iRoomDetails.showRoomDetails(id);
	}
	
	@DeleteMapping(value = "/deleteRoomById/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable int id)
	{
		iRoomDetails.removeRoomDetails(id);

		return new ResponseEntity<String>("User Deleted",HttpStatus.ACCEPTED);
	}

//	@DeleteMapping(value = "/deleteRoomById/{id}")
//	public ResponseEntity<String> deleteUserById(@PathVariable int id)
//	{
////		iRoomDetails.removeRoomDetails(id);
////
////		return new ResponseEntity<String>("User Deleted",HttpStatus.ACCEPTED);
//		try {
//			
//	    	return new ResponseEntity<String>(iRoomDetails.removeRoomDetails(id), HttpStatus.ACCEPTED);
//			}
//			
//			catch (NoSuchElementException e)
//			{
//				throw new IDNotFoundException("something went wrong while looking for id");
//			}
//	}
}
