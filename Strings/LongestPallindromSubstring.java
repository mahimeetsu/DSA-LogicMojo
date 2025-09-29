package com.strings;

public class LongestPallindromSubstring {
	public static void main(String[] args) {
		String s = "babad";
		int n = s.length();
		char ch[] = s.toCharArray();
		for (int i = 0; i < n; i++) {
			String sub = "";
			for (int j = i; j < n; j++) {
				sub = sub + ch[j];
				System.out.println(sub);
				boolean flag = isPallindrom(sub);
				if (flag) {
					System.out.println("Pallindrom:" + sub);
				}
			}
		}
	}

	private static boolean isPallindrom(String s) {
		int left = 0, right = 0;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
		}
		return true;
	}
}
