package com.techment.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This is the Payment POJO class
 * Contains data-members
 */


@Entity
@Table(name = "Admin121")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int adminId;
	
	@Column(name="adminName")
	String adminName;
	
	String password;

	public Admin() {
		super();
	}


	public Admin(int admin_id, String adminName, String password) {
		super();
		this.adminId = admin_id;
		this.adminName = adminName;
		this.password = password;
		//this.token = token;
	}


	public int getAdmin_id() {
		return adminId;
	}


	public void setAdmin_id(int admin_id) {
		this.adminId = admin_id;
	}


	public String getAdmin_name() {
		return adminName;
	}


	public void setAdmin_name(String admin_name) {
		this.adminName = admin_name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}




	



	
	
}
