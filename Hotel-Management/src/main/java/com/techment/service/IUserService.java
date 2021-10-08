package com.techment.service;

import java.util.List;

import com.techment.dto.UserDto;


public interface IUserService {

	String addUsers(UserDto user);
	List<UserDto> showAllUsers();
	UserDto updateUserById(UserDto user,int id);
	String removeUserById(int id);
	UserDto showUserById(int id);
}
