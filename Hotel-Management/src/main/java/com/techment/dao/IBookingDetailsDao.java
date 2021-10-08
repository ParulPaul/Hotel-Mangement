package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.BookingDetails;

@Repository
public interface IBookingDetailsDao extends JpaRepository<BookingDetails, Integer> {

}
