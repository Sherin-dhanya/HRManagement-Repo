package com.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrm.bean.EmployeeDetails;
import com.hrm.dao.EmployeeDAO;
import com.hrm.service.MailService;

@RestController

public class MailController {

	@Autowired 
	MailService service;
	@PostMapping("/mail")
	public String getMail() {
		
		service.Mail("jothilingamtpt@gmail.com","Hi jothi paithiyam ,How are you","Urgent");
		
		return null;
	}
}


