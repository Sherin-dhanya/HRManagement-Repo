//
//package com.hrm;
//
//import static org.junit.Assert.assertArrayEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.testng.Assert;
//
//import com.hrm.bean.EmployeeDetails;
//import com.hrm.controller.EmployeeController;
//import com.hrm.dao.EmployeeDAO;
//import com.hrm.dao.EmployeeDAOImplementation;
//
//@SpringBootTest
//public class EmployeeTesting {
//
//	
////	EmployeeController empController;
//	
//	@Test
//	void performInsertTest() {
//		
//		EmployeeDAO empDao = new EmployeeDAOImplementation();
//		
//		EmployeeDetails emp = new EmployeeDetails();
//		emp.setFirst_name("sherin");
//		emp.setLast_name("dhanu");
//		emp.setEmail_id("sherindhanya232@gmail.com");
//		emp.setPassword("Sherin@2002");
//		emp.setAddress("vetturnimadam");
//		emp.setCity("Nagercoil");
//		emp.setPhone_number(8056602328l);
//		emp.setPan_number("HGDF7894");
//		emp.setAadhar_number(78945612301542l);
//		
//		Boolean result = empDao.addEmployee(emp);
//		assertEquals(result,true);
//		
//	}
//	
//}