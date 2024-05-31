package com.hrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.hrm.bean.EmployeeDetails;
import com.hrm.bean.Payroll;
import com.hrm.bean.Project;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ProjectDAOImplementation implements ProjectDAO {
	@Autowired
	 EntityManager entityManager;
			
			

//		insert details  
			@Override
			public boolean addProject(Project project) {
				entityManager.persist(project);
				return true;
			}



@Override
public boolean save(Project project) {

	return false;
}

// get all details
@Override
public List<Project> getProject() {
	return entityManager.createQuery("from Project").getResultList();
}



@Override
public List<Integer> getIdList() {
	return entityManager.createQuery("select project_id from Project").getResultList();
	
}

//update

			@Override
			public ResponseEntity<?> updateProject(long Id, Project updatedproject) {
				Project existingProject = entityManager.find(Project.class, Id);
						
		        if (existingProject == null) {
		            return ResponseEntity.badRequest().body("Payroll not found");
		        }
		        
		        // Update
		        existingProject.setProject_title(updatedproject.getProject_title());
		        existingProject.setObjectives(updatedproject.getObjectives());
		        existingProject.setNo_of_phases(updatedproject.getNo_of_phases());
		        existingProject.setTimeline(updatedproject.getTimeline());
		        existingProject.setBudget(updatedproject.getBudget());
		        existingProject.setResource_allocation(updatedproject.getResource_allocation());

		 
		        // Save the update
		        entityManager.merge(existingProject);
		        return ResponseEntity.ok("Details updated successfully");
			}

		
}
