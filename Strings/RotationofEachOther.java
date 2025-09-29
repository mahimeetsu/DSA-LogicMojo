package com.strings;

public class RotationofEachOther {
	public static void main(String[] args) {
		String s1="abcd";
		String s2="cdab";
		s1=s1+s2;//abcdabcd
		System.out.println(s1.contains(s2));
	}
}
