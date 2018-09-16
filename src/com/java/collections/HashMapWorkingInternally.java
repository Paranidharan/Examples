package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapWorkingInternally {
	
	public static void main(String [] arg ) {
	
		Map<String, String> map = new HashMap<>();
		map.put("1x","XX");
		map.put("2","YY");
		map.put("3","ZZ");
		System.out.println(map.size());
	}

}
