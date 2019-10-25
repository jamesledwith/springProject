package com.myFirstSpring.springProject;
import org.springframework.stereotype.Component;

//bean
@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	
	/*public int[] sort(int[] numbers) 
	{
		return numbers;
	}*/
	
	public int[] sort(int[] numbers) 
    { 
		//get length of array
        int numLength = numbers.length; 
        
        //iterate through array
        for (int i = 0; i < numLength-1; i++)
        	
            for (int j = 0; j < numLength-i-1; j++) 
                if (numbers[j] > numbers[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = numbers[j]; 
                    numbers[j] = numbers[j+1]; 
                    numbers[j+1] = temp; 
                }
        
		return numbers; 
    } 
}
