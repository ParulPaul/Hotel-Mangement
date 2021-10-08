package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ITransactionDao;
import com.techment.dto.TransactionsDto;
import com.techment.entity.Transactions;

@Service
public class TransactionServiceImpl implements ITransactionService {

	
	@Autowired
	ITransactionDao iTransactionDao;
	
	@Override
	public String addTransaction(TransactionsDto transactionsDto, int id) {
		
		Transactions transactions = new Transactions();
		
		transactions.setTransaction_id(transactionsDto.getTransaction_id());
		transactions.setAmount(transactionsDto.getAmount());
		
		iTransactionDao.save(transactions);
		
		return "transaction successfull";
	}
}
