package com.techment.service;

import java.util.List;

import com.techment.dto.RoomDto;

public interface IRoomDetailsService {


	String addRoomDetails(RoomDto roomDetailsDto);
	
	List<RoomDto> viewAllRoomDetails();
	
	String updateRoomDetails(RoomDto roomDetails, int room_id);
	String removeRoomDetails(int id);
	RoomDto showRoomDetails(int id);

}
