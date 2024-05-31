package com.hrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrm.bean.Admin;
import com.hrm.dao.AdminDAO;


@RestController
@CrossOrigin("*")
public class AdminController {

	
	@Autowired
	private AdminDAO adminDAO;
	
	
	public AdminController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostMapping("InsertValue")
	public Admin insertValue(@RequestBody Admin admin) {
	return adminDAO.save(admin);
	}
	
	@GetMapping("GetValueByAdmin/{email}")
	public Admin getValueByEmail(@PathVariable String email) {
	return adminDAO.getByEmail(email);
	}
	
	
}
