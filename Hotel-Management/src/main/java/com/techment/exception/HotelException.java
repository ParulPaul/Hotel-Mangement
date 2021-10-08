package com.techment.exception;

public class HotelException extends RuntimeException{

	
	String msgForhotelException;

	public HotelException(String msgForhotelException) {
		super();
		this.msgForhotelException = msgForhotelException;
	}

	public String getMsgForhotelException() {
		return msgForhotelException;
	}

	public void setMsgForhotelException(String msgForhotelException) {
		this.msgForhotelException = msgForhotelException;
	}
	
}
