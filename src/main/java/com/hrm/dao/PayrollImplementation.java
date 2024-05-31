package com.hrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.hrm.bean.EmployeeDetails;

import com.hrm.bean.Payroll;


import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class PayrollImplementation implements PayrollDAO{
	@Autowired
	 EntityManager entityManager;
			
			

//		insert details  
			@Override
			public boolean addPayroll(Payroll payroll) {
				entityManager.persist(payroll);
				return true;
			}

			@Override
			public boolean save(Payroll payroll) {
		
				return false;
			}

			@Override
			public List<Payroll> getPayroll() {
				return entityManager.createQuery("from Payroll").getResultList();
			}

//			get payroll by id
			
			@Override
			public List<Payroll> searchPayroll(int empid) {
				try {
					return entityManager.createQuery("SELECT p FROM Payroll p WHERE p.emp.id = :emp_id", Payroll.class)
					        .setParameter("emp_id", empid)
					        .getResultList();

				}catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				
			}

// update
			
			@Override
			public ResponseEntity<?> updatePayroll(long empId, Payroll updatedpayroll) {
				Payroll existingPayroll = entityManager.find(Payroll.class, empId);
						
		        if (existingPayroll == null) {
		            return ResponseEntity.badRequest().body("Payroll not found");
		        }
		        
		        // Update
		        existingPayroll.setPay_period(updatedpayroll.getPay_period());
		        existingPayroll.setGross_earnings(updatedpayroll.getGross_earnings());
		        existingPayroll.setDeductions(updatedpayroll.getDeductions());
		        existingPayroll.setNet_pay(updatedpayroll.getNet_pay());
		        existingPayroll.setHours_worked(updatedpayroll.getHours_worked());
		        existingPayroll.setOvertime_hours(updatedpayroll.getOvertime_hours());
		        existingPayroll.setLeave_balances(updatedpayroll.getLeave_balances());

		 
		        // Save the update
		        entityManager.merge(existingPayroll);
		        return ResponseEntity.ok("Details updated successfully");
			}

}
