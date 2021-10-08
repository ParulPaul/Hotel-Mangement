package com.techment.service;

import com.techment.dto.AdminDto;

public interface IAdminService {
	
	String addAdmin(AdminDto adminDto);
	AdminDto getAdminByNameAndPassword(String admin_name, String password);

}
