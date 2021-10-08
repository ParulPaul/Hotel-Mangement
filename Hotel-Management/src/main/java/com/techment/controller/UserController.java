package com.techment.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.UserDto;
import com.techment.exception.IDNotFoundException;
import com.techment.service.IUserService;


@RestController
@RequestMapping(value="userController")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	
	@PostMapping(value="/addUser")
	public String addNewUser(@Valid @RequestBody UserDto userDto,BindingResult bindingResult) throws MethodArgumentNotValidException {
		
		if(bindingResult.hasErrors()==true)
		{
			System.out.println("Some Error is there");
			List<FieldError> errors = bindingResult.getFieldErrors();
			List<String> errorList = new ArrayList<String>();
			
			for(FieldError f:errors)
			{
				errorList.add(f.getDefaultMessage());
			}
			
			throw new com.techment.exception.ValidationException(errorList);
		}
		
		userService.addUsers(userDto);

		return "Insertion Done";
	
//		userService.addUsers(user);
//		return new ResponseEntity<String>("Users added", HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/viewAllUser")
	public ResponseEntity<List<UserDto>> viewAllUser(){
		
		
		return new ResponseEntity<List<UserDto>>(userService.showAllUsers(), HttpStatus.ACCEPTED);
		
	}

	
	@PutMapping(value = "/updateUserById/{id}")
	public String updateEmployeeById(@PathVariable int id,@RequestBody UserDto user)
	{
		
		try
		{
			UserDto userDto = userService.updateUserById(user, id);
			userDto.setUser_name(user.getUser_name());
			userDto.setUser_email(user.getUser_email());
			userDto.setUser_password(user.getUser_password());
			userDto.setUser_mobile(user.getUser_mobile());
			userDto.setUser_role(user.getUser_role());
			userDto.setUser_address(user.getUser_address());
			
			userService.addUsers(userDto);
			
		
			return "User Details Updated";
		}
		catch(Exception e)
		{
			return e.toString();
		}
		
//		return new ResponseEntity<UserDto>(userService.updateUserById(user, id),HttpStatus.OK);
	}
	
	

	@GetMapping(value = "/showUserById/{id}")
	public UserDto getEmployeeById(@PathVariable int id)
	{
		
		try {
			UserDto users = userService.showUserById(id);
			return users;
		}catch(NoSuchElementException e) {
			throw new IDNotFoundException("No Such Id Details Present");
		}
		
		//return userService.showUserById(id);
	}
	
	@DeleteMapping(value = "/removeUserById/{id}")
	public String deleteUserById(@PathVariable int id)
	{
		
		try {
			userService.removeUserById(id);
			return "User Data Deleted";

		} catch (Exception e) {
		
			throw new IDNotFoundException("No Such Id Details Present");
		}
		
		
		//userService.removeUserById(id);
		//return new ResponseEntity<String>("User Deleted",HttpStatus.ACCEPTED);
	}
}
