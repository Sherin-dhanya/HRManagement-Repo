package com.hrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrm.bean.Performance;
import com.hrm.dao.PerformanceDAO;


@RestController
@CrossOrigin("*")
public class PerformanceController {

	
	@Autowired
	private PerformanceDAO performanceDAO;

	
//	insert details
	@PostMapping("/insertPerform")
	public boolean addPerform(@RequestBody Performance performance)
	{
		return performanceDAO.addPerform(performance);
	}
}





