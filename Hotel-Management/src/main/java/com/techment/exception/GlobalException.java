package com.techment.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(value = InvalidUserExcpetion.class)
	public ResponseEntity<Object> myException(InvalidUserExcpetion exception)
	{
		return new ResponseEntity<Object>(exception.getMsg(), HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler(value=HotelException.class)
	public ResponseEntity<String> myHotelException(HotelException hotelException )
	{
		return new ResponseEntity<String>(hotelException.getMsgForhotelException(),HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(value=BookingDetailsException.class)
	public ResponseEntity<String> myBookingDetails(BookingDetailsException bookingDetailsException )
	
	{
		return new ResponseEntity<String>(bookingDetailsException.msg,HttpStatus.BAD_REQUEST);
		
	}

	@ExceptionHandler(value=RoomDetailsException.class)
	public ResponseEntity<String> myRoomDetailsException(RoomDetailsException roomexception)
	{
		return new ResponseEntity<String>(roomexception.getRoomDetailsMessage(),HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(value= PaymentException.class)
	public ResponseEntity<Object> myPaymentException(PaymentException exception)
	{
		return new ResponseEntity<Object>(exception.getMsg2(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value= TransactionException.class)
	public ResponseEntity<Object> myTransactionException(TransactionException exception)
	{
		return new ResponseEntity<Object>(exception.getMsg3(), HttpStatus.BAD_REQUEST);
	}
	
}
