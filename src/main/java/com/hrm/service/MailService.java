package com.hrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.hrm.bean.EmployeeDetails;

@Service
public class MailService {

	@Autowired
	JavaMailSender mailSender;

	public String Mail(String toMail, String body,String subject) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("sherindhanya232@gmail.com");
		message.setTo(toMail);
		message.setText(body);
		message.setSubject(subject);
		mailSender.send(message);
		
		return null;
}
}