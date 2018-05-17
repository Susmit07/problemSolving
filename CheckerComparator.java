package com.sapient.logicals;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class CheckerComparator  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		PlayerComparator p1 = (PlayerComparator) o1;
		PlayerComparator p2 = (PlayerComparator) o2;

		// a negative integer, zero, or a positive integer as the first argument is less than, equal to, 
		// or greater than the second. Here the requirement is to sort by descending
		
		if(p1.score == p2.score){
			return p1.name.compareTo(p2.name);
		}else if(p1.score < p2.score){
			return 1;
		}else{
			return -1;
		}
	}
}
