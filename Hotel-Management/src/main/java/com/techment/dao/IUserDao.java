package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.dto.UserDto;
import com.techment.entity.Users;

@Repository
public interface IUserDao extends JpaRepository<Users, Integer> {

	
}
