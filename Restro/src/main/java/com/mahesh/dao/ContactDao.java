package com.mahesh.dao;

public interface ContactDao {
	
	public String saveContact(String name, String email, String subject, String message,String datetime);

}
