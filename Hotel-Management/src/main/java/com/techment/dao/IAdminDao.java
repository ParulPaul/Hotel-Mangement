package com.techment.dao;






import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.techment.entity.Admin;

@Repository
public interface IAdminDao extends JpaRepository<Admin, Integer> {

	Admin findByAdminNameAndPassword(String adminName, String password);
	
	//Admin loginByName(String admin_name, Integer password);
	
}