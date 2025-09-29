package com.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortByFreq {
	public static void main(String[] args) {
		String s = "tree";
		// System.out.println(frequencySort(s));
		// System.out.println(frequencySortMap(s));
		System.out.println(frequencySortMapHeap(s));

	}

	public static String frequencySort(String s) {
		Map<Character, Long> charMap = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// System.out.println(charMap);
		charMap.entrySet().stream().sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
				.forEach(System.out::println);
		return null;
	}

	public static String frequencySortMap(String s) {
		// count frequency using Map
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
		// sort based on frequncy
		List<Character> chars = new ArrayList<>(map.keySet());
		System.out.println(chars);
		Collections.sort(chars, (a, b) -> map.get(b) - map.get(a));
		System.out.println(chars);
		// build ans
		StringBuilder sb = new StringBuilder();
		for (Object c : chars) {
			// to store dupliate chars
			for (int i = 0; i < map.get(c); i++) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static String frequencySortMapHeap(String s) {
		// count frequency using Map
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
		PriorityQueue<Character> pq = new PriorityQueue<Character>((a, b) -> map.get(b) - map.get(a));
		System.out.println(pq);
		pq.addAll(map.keySet());
		System.out.println(pq);
		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			char ch = pq.poll();
			for (int i = 0; i < map.get(ch); i++) {
				sb.append(ch);
			}
		}

		return sb.toString();
	}
}
