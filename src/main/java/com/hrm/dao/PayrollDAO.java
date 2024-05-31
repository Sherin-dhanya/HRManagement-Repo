package com.hrm.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hrm.bean.EmployeeDetails;

import com.hrm.bean.Payroll;


public interface PayrollDAO {

//	insert payroll details
	boolean save(Payroll payroll); 
	public boolean addPayroll(Payroll payroll);
	
//	get all
	public List<Payroll> getPayroll();
	
//	get payroll by id
	public List<Payroll> searchPayroll(int empid);


	// updating details
	
	ResponseEntity<?> updatePayroll(long id,Payroll payroll);
}