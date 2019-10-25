package com.myFirstSpring.springProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

//automatically scans package and sub-packages where @SpringBootApplication is
@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		
		//one bean and one dependency
		//					        	dependency on sort algo> <This algo is dependency of BinarySearch
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());  //Spring automatically creates this now
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringProjectApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		

		int result = binarySearch.binarySearch(new int[] {12,2,7,3}, 3);
		System.out.println(result);
	}

}
