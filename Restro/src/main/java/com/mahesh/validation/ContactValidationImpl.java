package com.mahesh.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactValidationImpl implements ContactValidation {
	private String result;

	public String contactValidation(String name, String email, String subject, String message) {
		// TODO Auto-generated method stub
		int name_len=name.length();
		int email_len=email.length();
		int subject_len=subject.length();
		int message_len=message.length();
		
		if(name_len<2 || name_len>50) {
			result="Invalid Name";
		}
		
	     else if (email_len < 7 || email_len > 50 || !isValidEmail(email)) {
	            result = "Invalid Email";
	        }
		
		
		else if(subject_len<10 || subject_len>80 ) {
			result="Invalid Subject";
		}
		
		else if(message_len<10 || name_len>700) {
			result="Invalid Message";
		}
		
		else {
			result="Valid";
		}
		return result;
	}

	private boolean isValidEmail(String email) {
String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        // Compile the regex
        Pattern pattern = Pattern.compile(emailRegex);

        // Match the email against the regex
        Matcher matcher = pattern.matcher(email);
        
        // Return true if the email matches the regex
        return matcher.matches();
	}

}
