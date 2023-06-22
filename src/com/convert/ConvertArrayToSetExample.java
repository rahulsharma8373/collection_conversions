package com.convert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertArrayToSetExample {

	public static void main(String[] args) {
	Integer [] arr = {1,2,3,4,5,6,7,8,9};
	Set<Integer>set=new HashSet<>(Arrays.asList(arr));
	set.forEach(value-> System.out.println(value));

	}

}
