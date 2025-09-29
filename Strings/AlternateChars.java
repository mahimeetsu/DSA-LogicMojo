package com.strings;

public class AlternateChars {
	public static void main(String[] args) {
		String s = "ABAABB";
		System.out.println(alternatingCharacters(s));
	}

	public static int alternatingCharacters(String s) {
		char ch[] = s.toCharArray();

		int res = 0;

		char c = ch[0];

		for (int i = 1; i < ch.length; i++) {
			if (ch[i] == c) {
				res++;
			}
			c=ch[i];
		}
		return res;
	}
}
