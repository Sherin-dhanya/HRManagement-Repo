package com.hrm.bean;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
//import jakarta.mail.FetchProfile.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="project_details")
public class Project {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int project_id;
	    private String project_title;
	    private String objectives;
	    private long no_of_phases;
	    private String timeline;
	    private long budget;
	    private String resource_allocation;
	    
	    @JsonIgnoreProperties("project")
	    @OneToMany(mappedBy="project", cascade = CascadeType.ALL)
	    private List<EmployeeDetails> employee;

		public Project() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		public Project(int project_id, String project_title, String objectives, long no_of_phases, String timeline,
				long budget, String resource_allocation, List<EmployeeDetails> employee) {
			super();
			this.project_id = project_id;
			this.project_title = project_title;
			this.objectives = objectives;
			this.no_of_phases = no_of_phases;
			this.timeline = timeline;
			this.budget = budget;
			this.resource_allocation = resource_allocation;
			this.employee = employee;
		}

		public int getProject_id() {
			return project_id;
		}

		public void setProject_id(int project_id) {
			this.project_id = project_id;
		}

		public String getProject_title() {
			return project_title;
		}

		public void setProject_title(String project_title) {
			this.project_title = project_title;
		}

		public String getObjectives() {
			return objectives;
		}

		public void setObjectives(String objectives) {
			this.objectives = objectives;
		}

		public long getNo_of_phases() {
			return no_of_phases;
		}

		public void setNo_of_phases(long no_of_phases) {
			this.no_of_phases = no_of_phases;
		}

		public String getTimeline() {
			return timeline;
		}

		public void setTimeline(String timeline) {
			this.timeline = timeline;
		}

		public long getBudget() {
			return budget;
		}

		public void setBudget(long budget) {
			this.budget = budget;
		}

		public String getResource_allocation() {
			return resource_allocation;
		}

		public void setResource_allocation(String resource_allocation) {
			this.resource_allocation = resource_allocation;
		}

		public List<EmployeeDetails> getEmployee() {
			return employee;
		}

		public void setEmployee(List<EmployeeDetails> employee) {
			this.employee = employee;
		}

		
    
}
