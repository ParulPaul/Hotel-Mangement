package com.techment.exception;

public class RoomDetailsException extends RuntimeException{

	String roomDetailsMessage;

	public RoomDetailsException(String roomDetailsMessage) {
		super();
		this.roomDetailsMessage = roomDetailsMessage;
	}

	public String getRoomDetailsMessage() {
		return roomDetailsMessage;
	}

	public void setRoomDetailsMessage(String roomDetailsMessage) {
		this.roomDetailsMessage = roomDetailsMessage;
	}
	
}
