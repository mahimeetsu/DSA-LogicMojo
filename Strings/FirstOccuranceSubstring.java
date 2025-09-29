package com.strings;

public class FirstOccuranceSubstring {
	public static void main(String[] args) {
		String haystack = "sadbutsad", needle = "sad";
		
		int n=needle.length();
		
		for(int i=0;i<=haystack.length()-n;i++)
		{
			String subString=haystack.substring(i,i+n);
			System.out.println(subString);
			if(subString.equals(needle))
			{
				System.out.println(i);
			}
		}
		
	}
}
