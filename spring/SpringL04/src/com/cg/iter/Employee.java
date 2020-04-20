package com.cg.iter;

import java.util.List;

public class Employee {
	private int EmployeeId;
	private EmpInfo empinfo;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, EmpInfo empinfo) {
		super();
		this.EmployeeId = employeeId;
		this.empinfo = empinfo;
	}

	@Override
	public String toString() {
		return "Input:\nEmployeeId=" + EmployeeId + "\noutput:\n" + empinfo + "";
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public void getEmpinfo() {
		EmpInfo e= new EmpInfo();
	System.out.println(e.getEmpinfo1());
	}
	public void setEmpinfo(EmpInfo empinfo) {
		
		this.empinfo = empinfo;
	}
	
	
}