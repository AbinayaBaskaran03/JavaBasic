package com.java.demo;
import java.util.ArrayList;
import java.util.Scanner;

public class Assingment4 {
public static void main(String[] args) {
		
	         
		Scanner value = new Scanner(System.in);
		
		System.out.println("Enter a:");
		int number = value.nextInt();
		System.out.println("Enter b:");
		int number1 = value.nextInt();
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(number);
		num.add(number1);
		
	    System.out.print("The given numbers are:  ");
	    System.out.println(num);

		ArrayList<Integer> num1 = new ArrayList<Integer>();

		for(int i = number;i<=number1;i++) {
			num1.add(i);
		}
	    System.out.println("Between numbers are:  ");
		System.out.print(num1);

//	min and max	
		int[] x = {number,number1};
			int max = x[0];
			int min = x[0];

			for(int i=0;i<x.length;i++) {
		    	value.nextLine();	
		    	
				if(x[i] > max) {
					max = x[i];
				}	
				if(x[i]< min) {
					min = x[i];
				}
			}
			System.out.println("The maximum num:"+max);
	    	System.out.println("The minimum num:"+min);	
	    	
//odd even	  
	    	
	    	for(int i= number;i<=number1;i++) {
	    		if(i%2==0) {
	    			System.out.println(i+":Even");
	    		}
	    		if(i%2!=0) {
	    			System.out.println(i+":Odd");
	    		}
	    	}
		value.close();
	}
	}


