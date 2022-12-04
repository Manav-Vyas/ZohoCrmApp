package com.zoho.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService{

	@Autowired
	private JavaMailSender sendEmail;
	
	@Override
	public void sendEmail(String to, String subject, String message) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(message);
		
		sendEmail.send(mail);
	}
	
}
