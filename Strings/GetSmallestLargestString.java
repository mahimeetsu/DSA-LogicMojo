package com.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetSmallestLargestString {
	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		// findSmallestLargestCompareTo(s, k);
		findSmallestLargestList(s, k);

	}

	private static void findSmallestLargestCompareTo(String s, int k) {
		String substring = s.substring(0, k);
		System.out.println(substring);
		String minstring = substring;
		String maxstring = substring;
		System.out.println("total length:" + s.length() + " length without k:" + (s.length() - k));
		for (int i = 1; i <= s.length() - k; i++) {
			substring = s.substring(i, i + k);
			System.out.println("substring:" + substring);
			if (substring.compareTo(minstring) < 0)
				minstring = substring;
			if (substring.compareTo(maxstring) > 0)
				maxstring = substring;
		}
		System.out.println("min string:" + minstring);
		System.out.println("max string:" + maxstring);
	}

	private static void findSmallestLargestList(String s, int k) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i <= s.length() - k; i++) {
			list.add(s.substring(i, i + k));
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println("min string:" + list.get(0));
		System.out.println("max string:" + list.get(list.size() - 1));
	}
}
