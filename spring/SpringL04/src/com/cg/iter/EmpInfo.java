package com.cg.iter;

import java.util.List;

public class EmpInfo {

	private List<String> empinfo1;

	public List<String> getEmpinfo1() {
		return empinfo1;
	}

	public void setEmpinfo1(List<String> empinfo1) {
		this.empinfo1 = empinfo1;
	}

	@Override
	public String toString() {
		return "Employee Info:\n" + empinfo1 + "";
	}

	public EmpInfo(List<String> empinfo1) {
		super();
		this.empinfo1 = empinfo1;
	}

	public EmpInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
