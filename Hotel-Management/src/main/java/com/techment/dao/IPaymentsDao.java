package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Payments;

public interface IPaymentsDao extends JpaRepository<Payments, Integer> {

}
