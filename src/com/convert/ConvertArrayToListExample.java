package com.convert;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToListExample {

	public static void main(String[] args) {
		List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
		   // convert List to array

		Integer[] targetArray=sourceList.toArray(new Integer[sourceList.size()]);
		// print set
	      System.out.println(Arrays.toString(targetArray));
	}

}
