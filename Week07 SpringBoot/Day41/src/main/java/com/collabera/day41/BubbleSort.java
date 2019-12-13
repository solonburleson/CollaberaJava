package com.collabera.day41;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSort implements SortAlgorithm {
	public int[] sort(int[] list) {
		//logic for sorting
		System.out.println("Bubble sort");
		return list;
	}
}
