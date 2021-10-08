package com.techment.dto;

public class AdminDto {
	

	int admin_id;
	
	String admin_name;
	
	String password;
	//String token;

	
	

	public AdminDto(int admin_id, String admin_name, String password) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.password = password;
	}



	public AdminDto() {
		super();
	}



	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AdminDto [admin_id=" + admin_id + ", admin_name=" + admin_name + ", password=" + password + "]";
	}



	

}
