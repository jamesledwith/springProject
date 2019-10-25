package com.myFirstSpring.springProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//bean   BinarySearchImpl depends on SortAlgorithm
@Component
public class BinarySearchImpl {
	
	//
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	//just implementing high level to show tight coupling
	public int binarySearch (int[] numbers, int numberToSearchFor) {
		
		//sort array dynamically using interface
		int[] sortedNumbers = sortAlgorithm.sort(numbers);	
		System.out.println(sortAlgorithm);
		
		//search an array
		//return the result 
		return 0;
	}
	
	
}
