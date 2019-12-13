package com.collabera.day41;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchClass {
	
	@Autowired
	SortAlgorithm sortAlg;
	
	//Constructor
//	BinarySearchClass(SortAlgorithm sortAlg) {
//		this.sortAlg = sortAlg;
//	}
	
	public int search(int[] list, int value) {
		//sorting logic
		int[] sortedList = sortAlg.sort(list);
		
		//searching logic
		
		return 0;
	}
}
