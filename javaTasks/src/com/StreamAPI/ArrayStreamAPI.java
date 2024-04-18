package com.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Arrays --->Stream
public class ArrayStreamAPI {
	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		List<String> uniquename = new ArrayList<String>();
		name.add("a");
		name.add("b");
		name.add("a");
		name.add("c");
		name.add("b");
//remove duplicate in array - stream 		
		name.stream().distinct().forEach((x) -> {
			System.out.println(x);

		});
		System.out.println("***duplicate***");
//convert arrays - stream

		int[] a = { 1, 2, 3 };
		long countvar = Arrays.stream(a).count();
		System.out.println(countvar);
		System.out.println("***count***");

//iterate Array(normal method)
//		int[] var = {10,20,30};
//
//		for(int i=0;i<var.length;i++) {
//			System.out.println(a[i]);
//		}
//		System.out.println("************");

//iterate array - Stream	

		int[] var1 = { 10, 20, 30 };
		Arrays.stream(var1).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("***iterate**");
//array sorting - stream
//string sorting in stream
		String[] names = { "abi", "kun", "arivu" };
		Arrays.stream(names).sorted().forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("****sorting**");
//	sorted() is an ascending order method
		int[] aObj = { 5, 8, 2 };
		Arrays.stream(aObj).sorted().forEach((y) -> {
			System.out.println(y);
		});
		System.out.println("***sorting***");
//array sum(normal)
		
//		int[] avar = { 5, 8, 2 };
//		int sum = 0;
//		for (int i = 0; i < avar.length; i++) {
//			sum = sum + avar[i];
//		}
//		System.out.println(sum);
//		System.out.println("************");

//Arrays sum in stream		
		int[] bvar = {10,12,8 };
		int sumObj = Arrays.stream(bvar).sum();
		System.out.println(sumObj);
		System.out.println("***sum****");
//Arrays average
		
		int[] cvar = {10,12,8 };
		OptionalDouble avg = Arrays.stream(cvar).average();
		System.out.println(avg.getAsDouble());
		System.out.println("****average***");
//Array even num in stream
//filter is an pridicate 		
		int[] dvar = {10,5,8,7};
		Arrays.stream(dvar).filter(x->x%2==0).forEach(
				(x)->{
					System.out.println(x);
				}
				);	
		System.out.println("***even***");

//Array min num in stream
		int[] evar = {1,5,3};
	  int minimum =	Arrays.stream(evar).min().getAsInt();
		System.out.println(minimum);
		System.out.println("***min****");
//Array max num in stream
		int[] fvar = {1,5,3};
		  int maximum =	Arrays.stream(fvar).max().getAsInt();
			System.out.println(maximum);
			System.out.println("***max*****");
//sequential stream
			int[] gvar = {1,5,3};
			boolean gObj = Arrays.stream(gvar).isParallel();
			System.out.println(gObj);
			System.out.println("***sequential stream*****");

//parallel stream
			int[] svar = {1,5,3};
			boolean sObj = Arrays.stream(svar).parallel().isParallel();
			System.out.println(sObj);
			System.out.println("***parallel stream*****");

			
		
	}
}
