package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IPaymentsDao;
import com.techment.dto.PaymentsDto;
import com.techment.entity.Payments;

@Service
public class PaymentServiceImpl implements IPaymentService  {

	@Autowired
	IPaymentsDao iPaymentsDao;
	
	@Override
	public String addPayment(PaymentsDto paymentsDto, int id) {
		Payments payments = new Payments();
		payments.setBooking_id(paymentsDto.getBooking_id());
		payments.setPayment_id(paymentsDto.getPayment_id());
		payments.setTransaction_id(paymentsDto.getTransaction_id());
		
		iPaymentsDao.save(payments);
		return "payment done";
	}

}
