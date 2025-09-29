package com.strings;

public class PallindromCheck {
	public static void main(String[] args) {
		String s = "malayalam";
		System.out.println(isPallindorm(s));
	}

	private static boolean isPallindorm(String s) {
		int left = 0, right = 0;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
		}
		return true;
	}
}
