package com.strings;

import java.util.HashMap;
import java.util.Map;

public class IsValidSameNoTimes {
	public static void main(String[] args) {
		String s="abcc";
		System.out.println(isValid(s));
	}

    public static String isValid(String s) {
    	String res="";
    	
    	Map<Character, Integer> map=new HashMap();
    	
    	for(char c:s.toCharArray())
    	{
    		map.put(c, map.getOrDefault(c,0)+1);
    	}
    	System.out.println(map);
    	for(Map.Entry me:map.entrySet())
    	{
    		System.out.println(me.getValue());
    	}
    	
    	return res;    	
    }
}
