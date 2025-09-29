package com.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class IsomorphicStrings {
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		System.out.println(check(s, t));
	}

	private static boolean check(String s, String t) {
		  int map1[]=new int[256];
	       int map2[]=new int[256];
	       //base case
	       if(s.length()!=t.length())
	            return false;
	        for(int i=0;i<s.length();i++)
	        {
	            if(map1[s.charAt(i)]!=map2[t.charAt(i)]) {
	                return false;
	            }
	            map1[s.charAt(i)]=i+1;
	            System.out.println(map1);
	            map2[t.charAt(i)]=i+1;
	            System.out.println(map2);
	        }
	        return true;

	}
}
