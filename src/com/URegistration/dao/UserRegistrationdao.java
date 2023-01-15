package com.URegistration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserRegistrationdao {
	
	
	
	String url ="jdbc:mysql://localhost:3306/flyawaydb?characterEncoding=utf8";
	String username="root";
	String password="root";
	String sql = "INSERT INTO user VALUES (?,?,?);";
	
	public boolean check(String name, String email, String pass){
		boolean flag =false;
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement st = con.prepareStatement(sql);
			
			
			st.setString(1,name);
			st.setString(2,email);
			st.setString(3,pass);
			
			
			int rs = st.executeUpdate();
			
			if(rs == 1){
				flag =true;
				return flag;
			}
			
		
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
		return flag;
		
		
		
		
		
	}
	
	

}
