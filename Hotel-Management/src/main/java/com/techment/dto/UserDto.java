package com.techment.dto;

public class UserDto {

	  int user_id;
	 String user_name;
	 	
	    String user_email;
	    
	    String user_password;
		
	    String user_role;
		
	    String user_mobile;
		
	    String user_address;

	
	    
	    
	    
		public UserDto(int user_id, String user_name, String user_email, String user_password, String user_role,
				String user_mobile, String user_address) {
			super();
			this.user_id = user_id;
			this.user_name = user_name;
			this.user_email = user_email;
			this.user_password = user_password;
			this.user_role = user_role;
			this.user_mobile = user_mobile;
			this.user_address = user_address;
		}

		public String getUser_name() {
			return user_name;
		}

		public void setUser_name(String user_name) {
			this.user_name = user_name;
		}

		public String getUser_email() {
			return user_email;
		}

		public void setUser_email(String user_email) {
			this.user_email = user_email;
		}

		public String getUser_password() {
			return user_password;
		}

		public void setUser_password(String user_password) {
			this.user_password = user_password;
		}

		public String getUser_role() {
			return user_role;
		}

		public void setUser_role(String user_role) {
			this.user_role = user_role;
		}

		public String getUser_mobile() {
			return user_mobile;
		}

		public void setUser_mobile(String user_mobile) {
			this.user_mobile = user_mobile;
		}

		public String getUser_address() {
			return user_address;
		}

		public void setUser_address(String user_address) {
			this.user_address = user_address;
		}

		@Override
		public String toString() {
			return "UserDto [user_name=" + user_name + ", user_email=" + user_email + ", user_password=" + user_password
					+ ", user_role=" + user_role + ", user_mobile=" + user_mobile + ", user_address=" + user_address
					+ "]";
		}

		public void setUser_id(int id) {
			// TODO Auto-generated method stub
			
		}

		public int getUser_id() {
			return user_id;
		}
	    
	    
	    
}
