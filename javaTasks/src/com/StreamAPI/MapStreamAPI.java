package com.StreamAPI;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//MAp Stream API
public class MapStreamAPI {
	public static void main(String[] args) {
		
//get keys only by stream		
		Map<Integer, String> key = new HashMap<Integer, String>();
		key.put(5, "abi");
		key.put(0, "indhu");
		key.put(1, "kalai");
		key.put(2, "jan");
		key.keySet().stream().forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("****keySet****");
//get only values  by stream		

		Map<Integer, String> val = new HashMap<Integer, String>();
		val.put(5, "abi");
		val.put(0, "indhu");
		val.put(1, "kalai");
		val.put(2, "jan");
		val.values().stream().forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("****values****");
//get both key and values		

		Map<Integer, String> keyval = new HashMap<Integer, String>();
		keyval.put(5, "abi");
		keyval.put(0, "indhu");
		keyval.put(1, "kalai");
		keyval.put(2, "jan");
		keyval.entrySet().stream().forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("****entrySet****");
//sort the data based on key in descending order
		Map<Integer, String> sortkeydes = new HashMap<Integer, String>();
		sortkeydes.put(5, "abi");
		sortkeydes.put(0, "indhu");
		sortkeydes.put(1, "kalai");
		sortkeydes.put(2, "jan");
		sortkeydes.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder()))
		.forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("****sort the data based on key in descending order ****");
//sort the data based on key in ascending order
		Map<Integer, String> sortkeyasc = new HashMap<Integer, String>();
		sortkeyasc.put(5, "abi");
		sortkeyasc.put(0, "indhu");
		sortkeyasc.put(1, "kalai");
		sortkeyasc.put(2, "jan");
		sortkeyasc.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("****sort the data based on key in ascending order ****");
//sort the data based on values in ascending order
		Map<Integer, String> sortvalasc = new HashMap<Integer, String>();
		sortvalasc.put(5, "abi");
		sortvalasc.put(0, "indhu");
		sortvalasc.put(1, "kalai");
		sortvalasc.put(2, "jan");
		sortvalasc.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEach((x) -> {
			System.out.println(x);
		});
		System.out.println("****sort the data based on values in ascending order ****");
//sort the data based on values in descending order
				Map<Integer, String> sortvaldes = new HashMap<Integer, String>();
				sortvaldes.put(5, "abi");
				sortvaldes.put(0, "indhu");
				sortvaldes.put(1, "kalai");
				sortvaldes.put(2, "jan");
				sortvaldes.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
				.forEach((x) -> {
					System.out.println(x);
				});
				System.out.println("****sort the data based on values in descending order ****");
				
//convert map to list in stream on keys
				Map<Integer, String> mp2lst = new HashMap<Integer, String>();
				mp2lst.put(2, "i");
				mp2lst.put(3, "n");
				mp2lst.put(4, "d");
				mp2lst.put(5, "u");
			List<Integer> maptolist =	mp2lst.keySet().stream().collect(Collectors.toList());
			System.out.println(maptolist);
			System.out.println("****convert map to list in stream on keys ****");
//convert map to list in stream on values
			Map<Integer, String> mp2lstval = new HashMap<Integer, String>();
			mp2lstval.put(2, "i");
			mp2lstval.put(3, "n");
			mp2lstval.put(4, "d");
			mp2lstval.put(5, "u");
		List<String> maptolistval =	mp2lstval.values().stream().collect(Collectors.toList());
		System.out.println(maptolistval);
		System.out.println("****convert map to list in stream on values ****");	

	}

}
