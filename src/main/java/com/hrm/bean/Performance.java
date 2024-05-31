package com.hrm.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="performance_details")
public class Performance {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int performance_id;
	  private String emp_name;
	  private String job_role;
	  private long review_period;
	  private int job_knowledge;
	  private int work_quality;
	  private int attendance;
	  private int communication_skills;
	  private int dependability;
	  private int overall_value;
	  
	  @OneToOne
	    @JoinColumn(name = "emp_id")
	    private EmployeeDetails emp;

	public Performance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Performance(int performance_id, String emp_name, String job_role, long review_period, int job_knowledge,
			int work_quality, int attendance, int communication_skills, int dependability, int overall_value,
			EmployeeDetails emp) {
		super();
		this.performance_id = performance_id;
		this.emp_name = emp_name;
		this.job_role = job_role;
		this.review_period = review_period;
		this.job_knowledge = job_knowledge;
		this.work_quality = work_quality;
		this.attendance = attendance;
		this.communication_skills = communication_skills;
		this.dependability = dependability;
		this.overall_value = overall_value;
		this.emp = emp;
	}

	public int getPerformance_id() {
		return performance_id;
	}

	public void setPerformance_id(int performance_id) {
		this.performance_id = performance_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getJob_role() {
		return job_role;
	}

	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}

	public long getReview_period() {
		return review_period;
	}

	public void setReview_period(long review_period) {
		this.review_period = review_period;
	}

	public int getJob_knowledge() {
		return job_knowledge;
	}

	public void setJob_knowledge(int job_knowledge) {
		this.job_knowledge = job_knowledge;
	}

	public int getWork_quality() {
		return work_quality;
	}

	public void setWork_quality(int work_quality) {
		this.work_quality = work_quality;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getCommunication_skills() {
		return communication_skills;
	}

	public void setCommunication_skills(int communication_skills) {
		this.communication_skills = communication_skills;
	}

	public int getDependability() {
		return dependability;
	}

	public void setDependability(int dependability) {
		this.dependability = dependability;
	}

	public int getOverall_value() {
		return overall_value;
	}

	public void setOverall_value(int overall_value) {
		this.overall_value = overall_value;
	}

	public EmployeeDetails getEmp() {
		return emp;
	}

	public void setEmp(EmployeeDetails emp) {
		this.emp = emp;
	}

	

}
