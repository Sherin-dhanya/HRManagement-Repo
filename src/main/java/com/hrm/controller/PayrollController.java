package com.hrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrm.bean.EmployeeDetails;
import com.hrm.bean.Payroll;
import com.hrm.dao.PayrollDAO;


@RestController
@CrossOrigin("*")
public class PayrollController {
	@Autowired
	private PayrollDAO payrollDAO;
	
//	@Autowired
//	PayrollService vService;

	
//	insert  payroll details
	@PostMapping("/insertpayroll")
	public boolean addPayroll(@RequestBody Payroll payroll)
	{
		return payrollDAO.addPayroll(payroll);
	}
	
//	view all payroll details
	@GetMapping("/viewallPay")
	public List<Payroll> getPayroll()
	{
		return payrollDAO.getPayroll();
	}
	
//    get payroll by empid
	@GetMapping("/payroll/{payrollById}") 
	public List<Payroll> searchPayroll(@PathVariable("payrollById")  int empid)
	{
		return payrollDAO.searchPayroll(empid);
	}

//	update payroll
	
	@PutMapping("/updatepayroll/{id}")
	public ResponseEntity<?> updatePayroll(@PathVariable("id") Long id,
	                                      @RequestBody Payroll updatedPayroll) {
	    return payrollDAO.updatePayroll(id, updatedPayroll);
	}
}
