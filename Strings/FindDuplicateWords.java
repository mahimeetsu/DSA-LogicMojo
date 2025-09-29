package com.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateWords {
	public static void main(String[] args) {
		String str = "This sentence contains two words, one and two";
		Set<String> set = new HashSet();
		Arrays.stream(str.split(" ")).filter(s -> !set.add(s)).forEach(System.out::println);
	}
}
