package com.strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {
	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(checkAnagramsUsingMap(s, t));
	}

	private static boolean checkAnagramsUsingMap(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);

		for (char ch : t.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) - 1);
		//	if(map.get(ch)<0)
			//	return false;
		}
		// check if any values are non zero.

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() < 0)
				return false;
		}
		return true;
	}
}
