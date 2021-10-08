package com.techment.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.IAdminDao;
import com.techment.dto.AdminDto;
import com.techment.entity.Admin;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	   IAdminDao adminDao;
	
	@Override
	public String addAdmin(AdminDto adminDto) {
		
	
				Admin admin = new Admin();
				if (adminDto.getAdmin_id()!=0) {
					
					admin.setAdmin_id(adminDto.getAdmin_id());
			
		        admin.setAdmin_name(adminDto.getAdmin_name());
					
		        admin.setPassword(adminDto.getPassword());

		        adminDao.save(admin);
		        return "Admin is added";
			}
				else
					return "Pleasre Enter Valid id";
				
				
				
				
	}


	@Override
	public AdminDto getAdminByNameAndPassword(String admin_name, String password) {
		
		Admin admin = adminDao.findByAdminNameAndPassword(admin_name, password);
		AdminDto adminDto = new AdminDto(admin.getAdmin_id(),admin.getAdmin_name(),admin.getPassword());
		return adminDto;
	}

	

}
