package com.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "abcabcbb";

		Set set = new HashSet();
		int max = Integer.MIN_VALUE;
		int left = 0, right = 0;
		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				max = Math.max(set.size(), max);
				right++;
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}

		System.out.println(max);
	}
}
