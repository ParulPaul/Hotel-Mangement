package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IRoomDao;
import com.techment.dto.RoomDto;
import com.techment.dto.UserDto;
import com.techment.entity.BookingDetails;
import com.techment.entity.RoomDetails;
import com.techment.entity.Users;

@Service
public class RoomDetailServiceImpl implements IRoomDetailsService {

	@Autowired
	IRoomDao roomDetailsDao;

	

	@Override
	public String addRoomDetails(RoomDto roomDetailsDto) {
		
		RoomDetails roomDetails = new RoomDetails(roomDetailsDto.getRoom_id(),roomDetailsDto.getRoom_no(),roomDetailsDto.getRoom_type(),
				roomDetailsDto.getRate_per_day(), roomDetailsDto.getIsavailable(),roomDetailsDto.getPhoto());
		roomDetailsDao.save(roomDetails);
		return "Room Details added";
	}

	@Override
	public List<RoomDto> viewAllRoomDetails() {
		List<RoomDetails> roomDetail= roomDetailsDao.findAll();
		List<RoomDto> roomDto = new ArrayList<RoomDto>();
		
		for(RoomDetails room : roomDetail )
		{

			roomDto.add(new RoomDto(room.getRoom_id(),room.getRoom_no(),room.getRoom_type(),
					room.getRate_per_day(), room.getIsAvailable(),room.getPhoto()));
		
		
			
	}
		

		return roomDto;
	
	}

	@Override
	public String updateRoomDetails(RoomDto roomDetails, int room_id) {

		RoomDetails room = roomDetailsDao.findById(room_id).get();
		room.setRoom_id(roomDetails.getRoom_id());
		room.setRoom_no(roomDetails.getRoom_no());
		room.setRoom_type(roomDetails.getRoom_type());
		room.setRate_per_day(roomDetails.getRate_per_day());
		room.setIsAvailable(roomDetails.getIsavailable());
		room.setPhoto(roomDetails.getPhoto());
	
		roomDetailsDao.save(room);
		return "updated room details";

	}

	@Override
	public String removeRoomDetails(int id) {
		roomDetailsDao.deleteById(id);
		return "User Deleted";
	}

	@Override
	public RoomDto showRoomDetails(int id) {
		RoomDetails details = roomDetailsDao.findById(id).get();
		RoomDto roomDto = new RoomDto(details.getRoom_id(),details.getRoom_no(),details.getRoom_type(),
				details.getRate_per_day(), details.getIsAvailable(),details.getPhoto());
	    return roomDto;
	}

}
