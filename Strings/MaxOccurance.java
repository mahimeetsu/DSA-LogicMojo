package com.strings;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurance {
	public static void main(String[] args) {
		String s = "javajj";// it should return a
		char ch[] = s.toCharArray();
		Map<Character, Integer> freqMap = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			freqMap.put(ch[i], freqMap.getOrDefault(ch[i], 0) + 1);
		}
		System.out.println(freqMap);
		char maxChar = ' ';
		int big = Integer.MIN_VALUE;
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() > big) {
				big = entry.getValue();
				maxChar = entry.getKey();
			}
		}
		System.out.println(maxChar);
	}
}
