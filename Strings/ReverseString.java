package com.strings;

public class ReverseString {
	public static void main(String[] args) {
		String s = "java";
		StringBuilder sb = new StringBuilder(s).reverse();
		System.out.println(sb.toString());
		
	}
}
