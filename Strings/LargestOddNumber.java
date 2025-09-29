package com.strings;

public class LargestOddNumber {
	public static void main(String[] args) {
		String n = "52";
		int n1 = Integer.parseInt(n);
		System.out.println(largestOddNum(n));
	}

	public static String largestOddNum(String num) {
		if ((int) num.charAt(num.length() - 1) % 2 == 1)
			return num;
		int i = num.length() - 1;
		while (i >= 0) {
			int n = (int) num.charAt(i);
			if (n % 2 == 1)
				return num.substring(0, i + 1);
			i--;
		}
		return "";
	}
}
