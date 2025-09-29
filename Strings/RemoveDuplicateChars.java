package com.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {
	public static void main(String[] args) {
		String s = "HappyNewYear";
		usingSet(s);
		usingBooleanArray(s);
	}

	private static void usingBooleanArray(String s) {
		StringBuilder sb = new StringBuilder();
		boolean chars[] = new boolean[256];
		char ch[] = s.toCharArray();
		for (char c : ch) {
			if (chars[c] == false) {
				sb.append(c);
				chars[c] = true;
			}
		}
		System.out.println(sb.toString());
	}

	private static void usingSet(String s) {
		StringBuilder sb = new StringBuilder();
		char ch[] = s.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		for (char c : ch) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
