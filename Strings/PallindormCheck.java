package com.strings;

public class PallindormCheck {
	public static void main(String[] args) {
		String str = "madam";
		int s = 0;
		int e = str.length()-1;

		while (s <= e) {
			if (str.charAt(s) == str.charAt(e)) {
				s++;
				e--;
			} else {
				break;
			}
		}
		if (s > e)
			System.out.println("pallindrom");
		else
			System.out.println("not pallindrom");

	}
}
