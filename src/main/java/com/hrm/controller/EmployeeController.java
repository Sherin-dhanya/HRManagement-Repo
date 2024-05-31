package com.hrm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hrm.bean.EmployeeDetails;
import com.hrm.dao.EmployeeDAO;


@RestController
@CrossOrigin("http://localhost:3000/")
public class EmployeeController {

	
	@Autowired
	private EmployeeDAO employeeDAO;
//	view all details
	
	@GetMapping("/viewemp")
	public List<EmployeeDetails> getEmployee()
	{
		return employeeDAO.getEmployee();
	}
	
//	insert details
	@PostMapping("/insertEmp")
	public boolean addEmployee(@RequestBody EmployeeDetails employeeDetails)
	{
		System.out.println(employeeDetails);
		return employeeDAO.addEmployee(employeeDetails);
	}
	
	@DeleteMapping("/delete/{deletebyid}") 
	public boolean deleteEmployee(@PathVariable("deletebyid") String employeeId)
	{
		  return employeeDAO.deleteEmployee(employeeId);
	}
	
	
//	search by id
	@GetMapping("/search/{searchById}") 
	public List<EmployeeDetails> searchEmployee(@PathVariable("searchById")  int empid)
	{
		return employeeDAO.searchEmployee(empid);
	}
	
// get id for payroll
	@GetMapping("/getbyidforpay")
	public List<Integer> doGetById(){
		return employeeDAO.getIdList();
	}
	@GetMapping("/Autopop")
	public List<Integer> doAutoPop(){
		return employeeDAO.getIdList();
	}
	
//	get by id
	@GetMapping("/getEmpById/{id}")
    public EmployeeDetails getEmp(@PathVariable int id) {
        try {
            return employeeDAO.geEmployeeId(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
 
        return null;
    }
	
//	updating
	

	    @PutMapping("updateEmp/{emp_id}")
	    public ResponseEntity<EmployeeDetails> updateEmployee(@PathVariable int emp_id, @RequestBody EmployeeDetails employee) {
	        employee.setEmp_id(emp_id);
	        employeeDAO.updateEmployee(employee);
	        return new ResponseEntity<>(employee, HttpStatus.OK);
	    }
	    
	    
	    
//	    login
	    
	    @PostMapping("/login")
		public ResponseEntity<?> login(@RequestBody EmployeeDetails employee) {
		     try {
		         // Find the Student by email
		         Optional<EmployeeDetails> employeeOptional = employeeDAO.getEmployeeByEmailId(employee.getEmail());
		        
		         
		         
		         if (!employeeOptional.isPresent()) {
		             return ResponseEntity.badRequest().body("Invalid email");
		         }
		 
		         EmployeeDetails employeeFound = employeeOptional.get();
		         Map<String, Integer> map=new HashMap<>();
		         map.put("emp_id", employeeFound.getEmp_id());
		 
		         // Check if password matches
		         if (!employee.getPassword().equals(employeeFound.getPassword())) {
		             return ResponseEntity.badRequest().body("Invalid password");
		         }
		 
		         return ResponseEntity.ok(map);
		     } catch (Exception e) {
		         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
		                .body("Error occurred during login: " + e.getMessage());
		     }
		     
		     
		}
	    

	}










