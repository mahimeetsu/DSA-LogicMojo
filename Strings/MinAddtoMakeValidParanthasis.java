package com.strings;

import java.util.Stack;

public class MinAddtoMakeValidParanthasis {
	public static void main(String[] args) {
		String s = "(()";
		System.out.println(minAddToMakeValidUsingStack(s));
		System.out.println(minAddToMakeValid(s));
	}

	public static int minAddToMakeValidUsingStack(String s) {
		char ch[] = s.toCharArray();
		int res = 0;
		Stack<Character> st = new Stack<>();

		for (char c : ch) {
			if (c == '(') {
				st.push(c);
			} else {
				if (st.isEmpty()) {
					res++;
				} else {
					st.pop();
				}
			}
		}
		return res+st.size();
	}

	public static int minAddToMakeValid(String s) {
		char ch[] = s.toCharArray();
		int oc = 0;
		int cc = 0;

		for (char c : ch) {
			// System.out.println(c);
			if (c == '(') {
				oc++;
			} else {
				if (oc > 0) {
					oc--;
				} else {
					cc++;
				}
			}
		}
		return oc + cc;
	}
}
