package com.techment.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.PaymentsDto;
import com.techment.entity.Payments;
import com.techment.exception.PaymentException;
import com.techment.service.IPaymentService;

@RestController
@RequestMapping(value="/payment")
public class PaymentsController {

	
	@Autowired
	private IPaymentService iPaymentService;
	
	@PostMapping(value="/addPayment")
	public ResponseEntity<String> addPay(@RequestBody Payments payments, @PathVariable int id) {
		PaymentsDto paymentsDto = new PaymentsDto();
//		return iPaymentService.addPayment(paymentsDto);
		
		try {
			
			return new ResponseEntity<String>(iPaymentService.addPayment(paymentsDto, id),HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			throw new PaymentException("no id present to get it ");
		}

	
	
	}


	
	
}

