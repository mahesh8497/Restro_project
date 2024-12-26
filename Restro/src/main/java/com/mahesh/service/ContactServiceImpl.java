package com.mahesh.service;

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
		}
		return result;
	}

}
