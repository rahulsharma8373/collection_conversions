package com.convert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertSetToArrayExample {

	public static void main(String[] args) {
	Set<Integer> sourceSet = new HashSet<>();
	sourceSet.add(0);
	sourceSet.add(1); 
	sourceSet.add(2);
	sourceSet.add(3);
	sourceSet.add(4);
	sourceSet.add(5);
	sourceSet.add(6);
	System.out.println(sourceSet);
	
	Integer [] sourceArray=sourceSet.toArray(new Integer[sourceSet.size()]);
	System.out.println(sourceArray);
	System.out.println(Arrays.toString(sourceArray));
	
	}

}
