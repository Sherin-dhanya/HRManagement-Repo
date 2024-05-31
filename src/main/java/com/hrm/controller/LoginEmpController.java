//package com.hrm.controller;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.hrm.bean.EmployeeDetails;
//import com.hrm.dao.EmployeeDAO;
//
//
//@RestController
//@CrossOrigin("*")
//public class LoginEmpController {
//
//	@Autowired
//	private EmployeeDAO empDAO;
//	
//	@PostMapping("/loginEmployee")
//	public ResponseEntity<?> login(@RequestBody EmployeeDetails employee) {
//	     try {
//	         // Find the Student by email
//	         Optional<EmployeeDetails> employeeOptional = empDAO.getEmployeeByEmailId(employee.getEmail());
//	        
//	         
//	         
//	         if (!employeeOptional.isPresent()) {
//	             return ResponseEntity.badRequest().body("Invalid email");
//	         }
//	 
//	         EmployeeDetails employeeFound = employeeOptional.get();
//	         Map<String, Long> map=new HashMap<>();
//	         map.put("emp_id", employeeFound.getEmployeeId());
//	 
//	         // Check if password matches
//	         if (!employee.getPassword().equals(employeeFound.getPassword())) {
//	             return ResponseEntity.badRequest().body("Invalid password");
//	         }
//	 
//	         return ResponseEntity.ok(map);
//	     } catch (Exception e) {
//	         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//	                .body("Error occurred during login: " + e.getMessage());
//	     }
//	     
//	     
//	}
//}