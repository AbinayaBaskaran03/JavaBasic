package com.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TaskStreamAPI {

	public static void main(String[] args) {

		List<TaskAPI> emp = new ArrayList<TaskAPI>();

		emp.add(new TaskAPI(101, "Abinaya", 5000));
		emp.add(new TaskAPI(102, "indhuma", 15000));
		emp.add(new TaskAPI(103, "kalai", 25000));
		emp.add(new TaskAPI(104, "janani", 7500));
//display empnames whose salary is > 70000		
		emp.stream().filter(x -> x.getSalary() >= 7000).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("*************");
//display emp count whose salary is > 70000		

		Optional<TaskAPI> maxi = emp.stream()
				.max(Comparator.comparing(TaskAPI::getSalary));// its an method reference
		System.out.println(maxi.get());
		System.out.println("*************");

	}

}
