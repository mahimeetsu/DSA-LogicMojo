package com.strings;

public class LongestPallindormCheck {
	public static void main(String[] args) {
		String s = "babad";
		System.out.println(findLongestPallindrom(s));
	}

	private static String findLongestPallindrom(String s) {
		StringBuilder sb = new StringBuilder();
		String p="";
		for (int i = 0; i < s.length(); i++) {
			p=p+s.charAt(i);
			System.out.println(p);
		}
		return null;
	}

}
