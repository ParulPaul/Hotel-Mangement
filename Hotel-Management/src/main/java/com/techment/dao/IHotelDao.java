package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Hotel;

@Repository
public interface IHotelDao extends JpaRepository<Hotel, Integer>{

}
