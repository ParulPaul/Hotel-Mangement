package com.techment.service;

import com.techment.dto.TransactionsDto;

public interface ITransactionService {

	
	String addTransaction(TransactionsDto transactionsDto, int id);
}
