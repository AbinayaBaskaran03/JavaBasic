package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class WithoutAPI {
	
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		List<String> uniquename = new ArrayList<String>();

		name.add("a");
		name.add("b");
		name.add("a");
		name.add("c");
		name.add("b");
		for (String s : name) {
			
			if (!uniquename.contains(s)) {
				uniquename.add(s);
			}
		}
		System.out.println(uniquename);

	}

}
