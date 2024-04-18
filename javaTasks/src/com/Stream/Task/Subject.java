package com.Stream.Task;

public class Subject {
	 
	private String tamil;
	private String english;
	private String maths;
	private String social;
	private String science;
	public String getTamil() {
		return tamil;
	}
	public void setTamil(String tamil) {
		this.tamil = tamil;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getMaths() {
		return maths;
	}
	public void setMaths(String maths) {
		this.maths = maths;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public String getScience() {
		return science;
	}
	public void setScience(String science) {
		this.science = science;
	}
	public Subject(String tamil, String english, String maths, String social, String science) {
		super();
		this.tamil = tamil;
		this.english = english;
		this.maths = maths;
		this.social = social;
		this.science = science;
	}
	@Override
	public String toString() {
		return "Subject [tamil=" + tamil + ", english=" + english + ", maths=" + maths + ", social=" + social
				+ ", science=" + science + "]";
	}

	
	
	
	
	

	
	
	

}
