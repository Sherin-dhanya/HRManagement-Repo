package com.hrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.hrm.bean.Project;

import com.hrm.dao.ProjectDAO;
@RestController
@CrossOrigin("*")
public class ProjectController {
	
	@Autowired
	private ProjectDAO projectDAO;

//	insert details
	@PostMapping("/insertProject")
	public boolean addProject(@RequestBody Project project)
	{
		return projectDAO.addProject(project);
	}
	
//	view all details
	
	@GetMapping("/viewallproj")
	public List<Project> getProject()
	{
		return projectDAO.getProject();
	}
//	get by id
	@GetMapping("/getbyid")
	public List<Integer> doGetById(){
		return projectDAO.getIdList();
	}
	
//	update 
	@PutMapping("/updateproject/{id}")
	public ResponseEntity<?> updateProject(@PathVariable("id") Long id,
	                                      @RequestBody Project updatedProject) {
	    return projectDAO.updateProject(id, updatedProject);
	}
}
