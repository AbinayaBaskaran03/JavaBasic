package com.StreamAPI;

public class TaskAPI {
	
	Integer empNo;
	String empName;
	Integer salary;
	public TaskAPI(Integer empNo, String empName, Integer salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return empNo+"-"+empName+"-"+salary;
	}

}
