package com.mahesh.service;

import java.time.LocalDateTime;

import com.mahesh.dao.ContactDaoImpl;
import com.mahesh.validation.ContactValidationImpl;

public class ContactServiceImpl implements ContactService {

	private String result;
	@Override
	public String ContactService1(String name, String email, String subject, String message) {
		// TODO Auto-generated method stub
		try {
			ContactValidationImpl contactValidationImpl =new ContactValidationImpl();
			result=contactValidationImpl.contactValidation(name, email, subject, message);
		} catch (Exception e) {
			result="Service Error";
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	@Override
	public String ContactService2(String name, String email, String subject, String message) {
		// TODO Auto-generated method stub
		try {
			String datetime= LocalDateTime.now().toString();
			ContactDaoImpl contactDaoImpl=new ContactDaoImpl();
		result=contactDaoImpl.saveContact(name, email, subject, message, datetime);
			
		} catch (Exception e) {
			result="Service Error";
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

}
