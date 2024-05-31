package com.hrm.dao;

import java.util.List;
import java.util.Optional;

import com.hrm.bean.EmployeeDetails;




public interface EmployeeDAO {
//	 view all details
	public List<EmployeeDetails> getEmployee();
	
//	insert details
	boolean save(EmployeeDetails employeeDetails);
	public boolean addEmployee(EmployeeDetails employeeDetails);

// delete details

	public boolean deleteEmployee(String employeeId);

	
	  

// get by id
	
	List<EmployeeDetails> getEmpById(int id);
	
//	search details
	public List<EmployeeDetails> searchEmployee(int empid);
	
//	get id for payroll
	public List<Integer> getIdList();


	// updating details
	
	  void updateEmployee(EmployeeDetails employeeDetails);
// login
	  
	Optional<EmployeeDetails> getEmployeeByEmailId(String email);

	
	EmployeeDetails geEmployeeId(int emp_id);
}
