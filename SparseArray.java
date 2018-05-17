package com.sapient.logicals;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class SparseArray {

	public static void main(String[] args) {

		String queryString = "abcd";
		Vector<String> collections = new Vector<String>();
		collections.add("abcd");
		collections.add("abab");
		collections.add("abcd");
		System.out.println(findSuffix(collections, queryString));

	}

	public static int findSuffix(Vector<String> collections, String queryString) {

		Map<String, Integer> map = new HashMap<String,Integer>();
		for(String collection : collections) {
			
			if(map.containsKey(collection)) {
				int count = map.get(collection);
				++count;
				map.put(collection, count);
			}else {
				map.put(collection,1);
			}
		}
		
		if(map.containsKey(queryString)) {
			return map.get(queryString);
		}else {
			return 0;
		}
	}

}
