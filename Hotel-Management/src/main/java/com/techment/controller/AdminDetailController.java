package com.techment.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.AdminDto;
import com.techment.service.IAdminService;

@RestController
@RequestMapping(value="adminController")
public class AdminDetailController {

	
	@Autowired
	IAdminService adminservice;
	
	@PostMapping(value = "/addAdmin")
	public ResponseEntity<String> addNewCustomer(@Valid @RequestBody AdminDto adminDto ,BindingResult bindingResult) throws MethodArgumentNotValidException
	{
		if(bindingResult.hasErrors())
		{
			List<FieldError> errors = bindingResult.getFieldErrors();
			List<String> errorList = new ArrayList<String>();
			
			for(FieldError f:errors)
			{
				errorList.add(f.getDefaultMessage());
			}
			
			
			throw new com.techment.exception.ValidationException(errorList);
		}
		
		adminservice.addAdmin(adminDto);
		return new ResponseEntity<String>("Added new admin",HttpStatus.OK);
	}


	
	
	@GetMapping("/Login/{admin_name}/{password}")
	public AdminDto loginAdmin(@PathVariable String admin_name,@PathVariable String password)
	{
		return adminservice.getAdminByNameAndPassword(admin_name,password);
	}
}
