package com.hrm.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hrm.bean.EmployeeDetails;
import com.hrm.bean.Payroll;
import com.hrm.bean.Project;

public interface ProjectDAO {

	
//	insert details
	boolean save(Project project);
	public boolean addProject(Project project);
	
//	 view all details
	public List<Integer> getIdList();
	
	List<Project> getProject();
	
//	update project

	ResponseEntity<?> updateProject(long id,Project project);
}
