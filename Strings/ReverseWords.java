package com.strings;

import java.util.Arrays;

public class ReverseWords {
	public static void main(String[] args) {
		String s = "a good   example";
		reverse(s);
	}

	public static void reverse(String s) {
		String str[] = s.split(" ");
		System.out.println("length:" + str.length);
		System.out.println(Arrays.toString(str));
		StringBuilder sb = new StringBuilder();
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i].length());
			if (str[i] != "")
				sb.append(str[i] + " ");
		}
		String ans = sb.toString();
		System.out.println(ans);
		System.out.println(ans.substring(0, ans.length() - 1));

	}
}
