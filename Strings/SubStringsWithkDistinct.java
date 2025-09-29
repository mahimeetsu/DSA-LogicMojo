package com.strings;

import java.util.HashSet;
import java.util.Set;

public class SubStringsWithkDistinct {
	public static void main(String[] args) {
		String s = "ab";
		int k = 1;
		findSubStrings(s, k);
	}

	public static void findSubStrings(String s, int k) {
		int n = s.length();
		int counter = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				counter = counter + checkKDistinct(s.substring(i, j), k);
			}
		}
		System.out.println(counter);
	}

	private static int checkKDistinct(String s, int k) {
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			set.add(c);
		}
		if (set.size() == k)
			return 1;
		else
			return 0;
	}
}
