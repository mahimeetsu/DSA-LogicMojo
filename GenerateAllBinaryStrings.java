package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinaryStrings {
	public static void main(String[] args) {
		int n = 2;
		System.out.println(generateBinaryStrings(n));
	}
	/*
	 * if n==1
	 * 0(ends with 0)
	 * 1(ends with 1)
	 * 
	 * if n==2
	 * take output from n==1, then add 0s for all i.e ends 0 and ends with 1
	 * 							   add 1s only for ends 0 ,but not for ends 1
	 * 
	 * 00
	 * 10
	 * 01
	 * 
	 */

	public static List<String> generateBinaryStrings(int n) {
		List<String> ansList = new ArrayList<String>();

		rec(n, 0, "", ansList);

		return ansList;
	}

	private static void rec(int n, int lastDigit, String s, List<String> ansList) {
		if (n == 0) {
			ansList.add(s);
			return;
		}
		rec(n - 1, 0, s + "0", ansList);
		if (lastDigit == 0) {
			rec(n - 1, 1, s + "1", ansList);
		}
	}
}
