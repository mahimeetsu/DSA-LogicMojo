package com.strings;

import java.util.Arrays;

public class StringArrayReverse {
	public static void main(String[] args) {
		String[] names = { "John", "Jammy", "Luke" };
		reverse(names);
		System.out.println(Arrays.toString(names));
	}

	private static void reverse(String[] names) {
		if (names.length == 0 || names.length == 1)
			return;
		for (int i = 0; i < names.length / 2; i++) {
			String temp = names[i];
			names[i] = names[names.length - 1];
			names[names.length - 1] = temp;
		}
	}
}
