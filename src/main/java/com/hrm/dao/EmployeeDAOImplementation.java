package com.hrm.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrm.bean.EmployeeDetails;
import com.hrm.bean.Payroll;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeDAOImplementation implements EmployeeDAO {

@Autowired
 EntityManager entityManager;
		
		

//	insert details  
		@Override
		public boolean addEmployee(EmployeeDetails employeeDetails) {
			entityManager.persist(employeeDetails);
			return true;
		}
	
//	delete details
	
	@Override
	public boolean deleteEmployee(String employeeId) {
		EmployeeDetails obj=entityManager.find(EmployeeDetails.class,employeeId);
		entityManager.remove(obj);
		return true;
	}
	
//	update details
//
//	    @Override
//	    public boolean updateEmployee(int empId, EmployeeDetails updatedEmployee) {
//	        try {
//	            EmployeeDetails existingEmployee = entityManager.find(EmployeeDetails.class, empId);
//	            entityManager.merge(existingEmployee);
//	            return true;
//	        } catch (Exception e) {
//	           
//	            return false;
//	        }
//	    }
	
	
	
// get by id
	    @SuppressWarnings("unchecked")
		@Override
		    public List<EmployeeDetails> getEmpById(int Id) {
		        List<EmployeeDetails> applications = new ArrayList<>();
		        try {
		        	applications = entityManager.createQuery("from EmployeeDetails E where E.id = :emp_id").setParameter("emp_id", Id).getResultList();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return applications;
		    }
	
//	search details
	@Override
	public List<EmployeeDetails> searchEmployee(int empid) {
		Query qry2=entityManager.createQuery("from EmployeeDetails v where v. emp_id=?1");
		qry2.setParameter(1,empid);
		List<EmployeeDetails> res=qry2.getResultList();
		return res;
	}
	
//	get all details
	
	@Override
	public List<EmployeeDetails> getEmployee() {
		return entityManager.createQuery("from EmployeeDetails").getResultList();
	}

	@Override
	public boolean save(EmployeeDetails employeeDetails) {
	
		return false;
	}
// get id for payroll
@Override
public List<Integer> getIdList() {
	return entityManager.createQuery("select emp_id from EmployeeDetails").getResultList();
	
}
//	update
	
    @Override
 
    public void updateEmployee(EmployeeDetails employee) {
        entityManager.merge(employee);
    }

    
//    login
   @Override
    public Optional<EmployeeDetails> getEmployeeByEmailId(String email) {
        return entityManager.createQuery("SELECT s FROM EmployeeDetails s WHERE s.email = :email", EmployeeDetails.class)
              .setParameter("email", email)
              .getResultStream()
              .findFirst();
    }
// get payroll by empid
  @Override
  	public EmployeeDetails geEmployeeId(int emp_id) {
  		return entityManager.find(EmployeeDetails.class, emp_id);
  	}
  
 
}


