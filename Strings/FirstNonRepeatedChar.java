package com.strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		String s = "java";
		Map<Character, Long> mapCount = s.chars().mapToObj(c -> Character.toLowerCase((char) c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mapCount);
		char ch=mapCount.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();
		System.out.println(ch);
	}
}
