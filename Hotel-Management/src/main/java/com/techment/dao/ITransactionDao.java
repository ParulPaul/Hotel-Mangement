package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Transactions;


@Repository
public interface ITransactionDao  extends JpaRepository<Transactions, Integer> {

}
