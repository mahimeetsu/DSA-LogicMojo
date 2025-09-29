package com.strings;

public class ValidParentheses {
	public static void main(String[] args) {
		String s = "(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(s));
	}

	public static int maxDepth(String s) {
		int count = 0;
		int max = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				count++;
				max = Math.max(max, count);
			} else if(c==')') {
				count--;
			}
		}
		return max;
	}
}
