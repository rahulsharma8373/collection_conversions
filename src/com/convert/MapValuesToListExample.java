package com.convert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapValuesToListExample {

	public List<String> mapValuesToList(Map<Integer, String> source) {
		List<String> targetList = new ArrayList<>(source.values());

		return targetList;

	}

	public static void main(String[] args) {

		MapValuesToListExample arrayListSetExample =new MapValuesToListExample();
	    Map < Integer, String > sourceMap = new HashMap<>();
	    sourceMap.put(100, "ABC");
        sourceMap.put(101, "PQR");
        sourceMap.put(102, "XYZ");
        
        List < String > targetList=
        		arrayListSetExample.mapValuesToList(sourceMap);
        System.out.println(targetList.toString());
	}

}
