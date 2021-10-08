package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IUserDao;
import com.techment.dto.UserDto;
import com.techment.entity.Users;

@Service
public class UsersServiceImpl implements IUserService
{

	@Autowired
	IUserDao userDao;
	
	@Override
	public String addUsers(UserDto users) {
		
		Users user = new Users();
		if(users.getUser_id()!=0) {
			user.setUser_id(users.getUser_id());
		}
		user.setUser_name(users.getUser_name());
		user.setUser_email(users.getUser_email());
		user.setUser_password(users.getUser_password());
		user.setUser_mobile(users.getUser_mobile());
		user.setUser_role(users.getUser_role());
		user.setUser_address(users.getUser_address());
		
		
		userDao.save(user);
		return "User is added";
		
	}

	@Override
	public List<UserDto> showAllUsers() {
		List<Users> user= userDao.findAll();
		List<UserDto> userDto = new ArrayList<UserDto>();
		
		for(Users c : user)
		{

			userDto.add(new UserDto(c.getUser_id(),c.getUser_name(),c.getUser_email(),c.getUser_password(),c.getUser_role(),c.getUser_mobile(),c.getUser_address()));					
	}
		

		return userDto;
	}

	@Override
	public UserDto updateUserById(UserDto user, int id) {
		
		Users existingUser = userDao.findById(id).get();
		existingUser.setUser_id(user.getUser_id());
		existingUser.setUser_name(user.getUser_name());
		existingUser.setUser_email(user.getUser_email());
		existingUser.setUser_password(user.getUser_password());
		existingUser.setUser_role(user.getUser_role());
		existingUser.setUser_mobile(user.getUser_mobile());
		existingUser.setUser_address(user.getUser_address());
		
		userDao.save(existingUser);
		return user;
	}

	@Override
	public String removeUserById(int id) {
		userDao.deleteById(id);
		return "User Deleted";
	}

	@Override
	public UserDto showUserById(int id) {
		
		Users user =userDao.findById(id).get();
		UserDto userDto = new UserDto(user.getUser_id(),user.getUser_address(), user.getUser_name(),user.getUser_email(),user.getUser_password(),user.getUser_role(),user.getUser_mobile());
	    return userDto;
		
	}

	
	
}
