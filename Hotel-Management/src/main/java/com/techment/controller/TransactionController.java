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

import com.techment.dto.TransactionsDto;
import com.techment.entity.Transactions;
import com.techment.exception.TransactionException;
import com.techment.service.ITransactionService;

@RestController
@RequestMapping(value="/transaction")
public class TransactionController {

	
	
	@Autowired
	private ITransactionService iTransactionService;
	
	@PostMapping(value="/addTransaction")
	public ResponseEntity<String> addTransfer(@RequestBody Transactions transactions, @PathVariable int id) {
	TransactionsDto transactionsDto = new TransactionsDto();
//		return iTransactionService.addTransaction(transactionsDto);
		
		try {
			
			return new ResponseEntity<String>(iTransactionService.addTransaction(transactionsDto, id),HttpStatus.OK);
		}
		
		catch (NoSuchElementException e)
		{
			throw new TransactionException(" no transaction found ");
		}


	
	}

}
