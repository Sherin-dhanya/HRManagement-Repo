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
@Table(name="payroll_details")
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payroll_num;
    private String pay_period;
    private long gross_earnings;
    private long deductions;
    private long net_pay;
    private int hours_worked;
    private int overtime_hours;
    private int leave_balances;
    
    @OneToOne
    @JoinColumn(name = "emp_id")
    private EmployeeDetails emp;

	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payroll(int payroll_num, String pay_period, long gross_earnings, long deductions, long net_pay,
			int hours_worked, int overtime_hours, int leave_balances, EmployeeDetails emp) {
		super();
		this.payroll_num = payroll_num;
		this.pay_period = pay_period;
		this.gross_earnings = gross_earnings;
		this.deductions = deductions;
		this.net_pay = net_pay;
		this.hours_worked = hours_worked;
		this.overtime_hours = overtime_hours;
		this.leave_balances = leave_balances;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Payroll [payroll_num=" + payroll_num + ", pay_period=" + pay_period + ", gross_earnings="
				+ gross_earnings + ", deductions=" + deductions + ", net_pay=" + net_pay + ", hours_worked="
				+ hours_worked + ", overtime_hours=" + overtime_hours + ", leave_balances=" + leave_balances + ", emp="
				+ emp + "]";
	}

	public int getPayroll_num() {
		return payroll_num;
	}

	public void setPayroll_num(int payroll_num) {
		this.payroll_num = payroll_num;
	}

	public String getPay_period() {
		return pay_period;
	}

	public void setPay_period(String pay_period) {
		this.pay_period = pay_period;
	}

	public long getGross_earnings() {
		return gross_earnings;
	}

	public void setGross_earnings(long gross_earnings) {
		this.gross_earnings = gross_earnings;
	}

	public long getDeductions() {
		return deductions;
	}

	public void setDeductions(long deductions) {
		this.deductions = deductions;
	}

	public long getNet_pay() {
		return net_pay;
	}

	public void setNet_pay(long net_pay) {
		this.net_pay = net_pay;
	}

	public int getHours_worked() {
		return hours_worked;
	}

	public void setHours_worked(int hours_worked) {
		this.hours_worked = hours_worked;
	}

	public int getOvertime_hours() {
		return overtime_hours;
	}

	public void setOvertime_hours(int overtime_hours) {
		this.overtime_hours = overtime_hours;
	}

	public int getLeave_balances() {
		return leave_balances;
	}

	public void setLeave_balances(int leave_balances) {
		this.leave_balances = leave_balances;
	}

	public EmployeeDetails getEmp() {
		return emp;
	}

	public void setEmp(EmployeeDetails emp) {
		this.emp = emp;
	}

	public void setEmp_id(int emp_id) {
		// TODO Auto-generated method stub
		
	}

	public void setInterviewStatus(EmployeeDetails emp2) {
		// TODO Auto-generated method stub
		
	}

	
   
}