package com.collabera.day41;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// Enable auto config
// component scan
// spring config
public class Day41Application {

	public static void main(String[] args) {
		// application context
		// XML was used for configuring the application
		// Annotations for configuring application/spring framework
		
		ApplicationContext ac = SpringApplication.run(Day41Application.class, args);
		
		
		//1. Console based
		//2. Swing [desktop based]
		//3. web application
		
		//Binary Search - DNC
		
		//1. data should be sorted
		//2. search operation
		
		//accept the input
		//value to search
		
		//write a logic to search
		
		// to use bubble sort or quick sort before I do the search
		
		//dependency injection

		BinarySearchClass binarySearch = ac.getBean(BinarySearchClass.class);
		
		
//		int val = 2;
//		BinarySearchClass binarySearch;
//		if(val == 2) {
//			binarySearch = new BinarySearchClass(new BubbleSort());
//		} else {
//			binarySearch = new BinarySearchClass(new QuickSort());
//		}
		
		binarySearch.search(new int[] {2,3,4,6}, 1);
		
//		for(String name : ac.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
	}

}
