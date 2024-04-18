package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListStreamAPI {
	
//List stream API
	public static void main(String[] args) {
		
//intermediate operations		
//remove null from arraylist -stream
		List<String> nullobj = new ArrayList<String>();
		nullobj.add(null);
		nullobj.add("a");
		nullobj.add("a");
		nullobj.add("b");
		nullobj.add("c");
		nullobj.add(null);
		nullobj.stream().filter(x -> x != null).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("***null***");
//remove duplicate 
		List<String> dup = new ArrayList<String>();
		dup.add("a");
		dup.add("a");
		dup.add("b");
		dup.add("c");
		dup.add("c");
		dup.add("d");
		dup.stream().distinct().forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("***duplicate***");
//remove duplicate & null in arraylist
		List<String> list = new ArrayList<String>();
		list.add(null);
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(null);
		list.stream().distinct().filter(x -> x != null).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("***duplicate n null***");
//arraylist sorting
		List<String> sort = new ArrayList<String>();
		sort.add("d");
		sort.add("a");
		sort.add("c");
		sort.add("b");
		sort.add("e");
		sort.stream().sorted().forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("*** sort***");

//remove duplicate & null & sorting in arraylist
//distinct,filter,sorted is an intermediate
//forEach is an terminal
		List<String> dns = new ArrayList<String>();
		dns.add(null);
		dns.add("a");
		dns.add("a");
		dns.add("b");
		dns.add("c");
		dns.add(null);
		System.out.println(dns);
		dns.stream().distinct().filter(x -> x != null).sorted().forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("***duplicate n null n sort***");
//map() uppercase Straeam				
		List<String> upcase = new ArrayList<String>();
		upcase.add(null);
		upcase.add("a");
		upcase.add("a");
		upcase.add("b");
		upcase.add("c");
		upcase.add(null);
		upcase.stream().distinct().filter(x -> x != null).map(y -> y.toUpperCase()).sorted().forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("***duplicate n null n sort n uppercase***");
//limit() in stream API
		List<String> limit = new ArrayList<String>();
		limit.add("a");
		limit.add("a");
		limit.add("b");
		limit.add("c");
		limit.stream().limit(3).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("***limit***");
//skip() in stream API
		List<String> skip = new ArrayList<String>();
		skip.add("a");
		skip.add("a");
		skip.add("b");
		skip.add("c");
		skip.stream().skip(2).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("***skip***");
//skip() and limit() in stream API
		List<String> ls = new ArrayList<String>();
		ls.add("a");
		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.stream().skip(2).limit(1).forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("***skip n limit***");
//Terminal Operaitons
//reduce()
		List<Integer> reduce = new ArrayList<Integer>();
		reduce.add(2);
		reduce.add(3);
		reduce.add(1);
		reduce.add(4);
		Optional<Integer> red = reduce.stream().reduce((a, b) -> a - b);
		System.out.println(red.get());
//First reduction:
//			(2, 3) -> 2 - 3 = -1
//			Result so far: [-1, 1, 4]
//	Second reduction:
//			(-1, 1) -> -1 - 1 = -2
//			Result so far: [-2, 4]
//Third reduction:
//			(-2, 4) -> -2 - 4 = -6
//			Result so far: [-6]
		System.out.println("***reduce***");
//count()
		List<Integer> cou = new ArrayList<Integer>();
		cou.add(2);
		cou.add(3);
		cou.add(1);
		cou.add(4);
		long count = cou.stream().count();
		System.out.println(count);
		System.out.println("***count***");
//toArray()		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(3);
		arr.add(1);
		arr.add(4);
		Object[] array = arr.stream().toArray();
		for (Object obj : array) {
			System.out.println(obj);
		}
		
		System.out.println("***toArray***");
//maximum
		List<Integer> max = new ArrayList<Integer>();
		max.add(2);
		max.add(3);
		max.add(8);
		max.add(4);
		Optional<Integer> maxi = max.stream().max((x1,x2) -> x1.compareTo(x2));
		System.out.println(maxi.get());
		System.out.println("***maximum***");
//minimum
				List<Integer> min = new ArrayList<Integer>();
				min.add(2);
				min.add(3);
				min.add(8);
				min.add(4);
				Optional<Integer> mini = min.stream().min((x1, x2) -> x1.compareTo(x2));
				System.out.println(mini.get());
				System.out.println("***minimum***");
//collect() 
//List-->stream()-->Stream-->Collectors.tolist()-->List
				List<Integer> coll = new ArrayList<Integer>();
				coll.add(1);
				coll.add(2);
				coll.add(3);
				coll.add(4);
				List<Integer> collect = coll.stream().distinct().collect(Collectors.toList());
				System.out.println(collect);
				System.out.println("***collect***");
//findFirst()
				List<Integer> fnd1st = new ArrayList<Integer>();
				fnd1st.add(10);
				fnd1st.add(2);
				fnd1st.add(3);
				fnd1st.add(4);
				Optional<Integer> find = fnd1st.stream().findFirst();
				System.out.println(find.get());
				System.out.println("***findFirst***");
//findAny()
//its also returns first elements
				List<Integer> fndany = new ArrayList<Integer>();
				fndany.add(10);
				fndany.add(2);
				fndany.add(3);
				fndany.add(4);
				Optional<Integer> findany = fndany.stream().findAny();
				System.out.println(findany.get());
				System.out.println("***findAny***");			
//anyMatch()
				List<String> anymat = new ArrayList<String>();
				anymat.add("Learning");
				anymat.add("Stream");
				anymat.add("API");
				anymat.add("Basics");
				boolean match = anymat.stream().anyMatch(x->x.startsWith("Stream"));
				System.out.println(match);
				System.out.println("***anyMatch***");	
//allMatch()	
				List<String> allmat = new ArrayList<String>();
				allmat.add("Learning");
				allmat.add("Stream");
				allmat.add("API");
				allmat.add("Basics");
				boolean allmatch = allmat.stream().allMatch(x->x.startsWith("Learning   "));
				System.out.println(allmatch);
				System.out.println("***allmatch***");	
				

	}

}
