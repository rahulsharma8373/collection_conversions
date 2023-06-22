package com.convert;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapValuesToSetExample {

    public Set < String > mapValuesToList(Map < Integer, String > sourceMap) {
        Set < String > targetList = new HashSet < > (sourceMap.values());
        return targetList;
    }

    public static void main(String[] args) {

        MapValuesToSetExample arrayListSetExample = new MapValuesToSetExample();
        Map < Integer, String > sourceMap = new HashMap < > ();
        sourceMap.put(100, "ABC");
        sourceMap.put(101, "PQR");
        sourceMap.put(102, "XYZ");
        Set < String > targetList = arrayListSetExample.mapValuesToList(sourceMap);
        System.out.println(targetList.toString());
    }
}