package com.mahesh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContactDaoImpl implements ContactDao {

	private String result;

	@Override
	public String saveContact(String name, String email, String subject, String message, String datetime) {

		try {
			Connection connection = ConnectionFactory.getConnection();
			String sql = "insert into contact(name,email,subject,message,datetime) values(?,?,?,?,?)";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, subject);
			preparedStatement.setString(4, message);
			preparedStatement.setString(5, datetime);

			int executeUpdate = preparedStatement.executeUpdate();
			if (executeUpdate == 1) {
				result = "Message Sent";
			} else {
				result = "Something Mistake ";
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result = "Something Mistake";
		}
		return result;
	}

}
