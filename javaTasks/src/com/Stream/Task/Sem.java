package com.Stream.Task;

import java.util.List;

public class Sem {
	
	
	private List<Subject> sem1;
	private List<Subject> sem2;
	private List<Subject> sem3;
	private List<Subject> sem4;
	
	
	
	public List<Subject> getSem1() {
		return sem1;
	}
	public void setSem1(List<Subject> sem1) {
		this.sem1 = sem1;
	}
	public List<Subject> getSem2() {
		return sem2;
	}
	public void setSem2(List<Subject> sem2) {
		this.sem2 = sem2;
	}
	public List<Subject> getSem3() {
		return sem3;
	}
	public void setSem3(List<Subject> sem3) {
		this.sem3 = sem3;
	}
	public List<Subject> getSem4() {
		return sem4;
	}
	public void setSem4(List<Subject> sem4) {
		this.sem4 = sem4;
	}
	public Sem(List<Subject> sem1, List<Subject> sem2, List<Subject> sem3, List<Subject> sem4) {
		super();
		this.sem1 = sem1;
		this.sem2 = sem2;
		this.sem3 = sem3;
		this.sem4 = sem4;
	}
	@Override
	public String toString() {
		return "Sem [sem1=" + sem1 + ", sem2=" + sem2 + ", sem3=" + sem3 + ", sem4=" + sem4 + "]";
	}
	
	
	
}
