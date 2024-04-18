package com.Stream.Task;

import java.util.List;

public class Student {

	private Integer id;
	private String name;
	private String dep;
	private String dob;
	private String phoneNo;
	private String mobileNo;
	
	

	private Gender Gender;

	private Address permanentAddress;
	private Address temporaryAddress;

	private List<Subject> sems;
	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public List<Subject> getSems() {
		return sems;
	}

	public void setSems(List<Subject> sems) {
		this.sems = sems;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Address getTemporaryAddress() {
		return temporaryAddress;
	}

	public void setTemporaryAddress(Address temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}

	public Student(Integer id, String name, String dep, String dob, String phoneNo, String mobileNo,
			com.Stream.Task.Gender gender, Address permanentAddress, Address temporaryAddress, List<Subject> sems) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.mobileNo = mobileNo;
		Gender = gender;
		this.permanentAddress = permanentAddress;
		this.temporaryAddress = temporaryAddress;
		this.sems = sems;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dep=" + dep + ", dob=" + dob + ", phoneNo=" + phoneNo
				+ ", mobileNo=" + mobileNo + ", Gender=" + Gender + ", permanentAddress=" + permanentAddress
				+ ", temporaryAddress=" + temporaryAddress + ", sems=" + sems + "]";
	}

	
	

	
	

	

	
	
}
