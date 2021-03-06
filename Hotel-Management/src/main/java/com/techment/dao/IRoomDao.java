package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.RoomDetails;

@Repository
public interface IRoomDao extends JpaRepository<RoomDetails, Integer> {

}
