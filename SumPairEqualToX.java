package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SumPairEqualToX {
	public static void main(String[] args) {
		int a[] = { 6, 1, 8, 0, 4, -9, -1, -10, -6, -5 }, x = 0;
		// System.out.println(getPairsUsingNestedLoops(a, x));
		System.out.println(getPairsUsingSortTwoPointers(a, x));
		// System.out.println(getPairsUsingMap(a, x));
	}

	// TLE
	public static ArrayList<ArrayList<Integer>> getPairsUsingNestedLoops(int[] arr, int x) {
		ArrayList<ArrayList<Integer>> ansList = new ArrayList();
		Set<List<Integer>> set = new HashSet();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == x) {
					List<Integer> currList = new ArrayList();
					currList.add(arr[i]);
					currList.add(arr[j]);
					Collections.sort(currList);
					set.add(currList);
				}
			}
		}
		System.out.println(set);
		ansList = new ArrayList(set);
		return (ArrayList<ArrayList<Integer>>) ansList.stream().sorted(Comparator.comparingInt(list -> list.get(0)))
				.collect(Collectors.toList());
	}

	public static ArrayList<ArrayList<Integer>> getPairsUsingSortTwoPointers(int[] arr, int x) {
		ArrayList<ArrayList<Integer>> ansList = new ArrayList();
		Set<List<Integer>> set = new HashSet();
		int n = arr.length;
		Arrays.sort(arr);
		int l = 0, r = arr.length - 1;
		while (l < r) {
			int sum = arr[l] + arr[r];
			if (sum == x) {
				List<Integer> currList = new ArrayList();
				currList.add(arr[l]);
				currList.add(arr[r]);
				Collections.sort(currList);
				set.add(currList);
				while ((l < r) && (arr[l] == arr[l + 1])) {
					l++;
				}
				while ((l < r) && (arr[r] == arr[r - 1])) {
					r--;
				}
				l++;
				r--;
			} else if (sum < 0) {
				l++;
			} else {
				r--;
			}
		}
		System.out.println(set);
		ansList = new ArrayList(set);
		return (ArrayList<ArrayList<Integer>>) ansList.stream().sorted(Comparator.comparingInt(list -> list.get(0)))
				.collect(Collectors.toList());	}

	public static ArrayList<ArrayList<Integer>> getPairsUsingMap(int[] arr, int x) {
		ArrayList<ArrayList<Integer>> ansList = new ArrayList();
		Set<List<Integer>> set = new HashSet();
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : arr) {
			int diff = x - n;
			if (map.containsKey(diff)) {
				List<Integer> currList = new ArrayList();
				currList.add(n);
				currList.add(diff);
				Collections.sort(currList);
				set.add(currList);
			} else {
				map.put(n, 1);
			}
		}
		System.out.println(set);
		ansList = new ArrayList(set);
		return (ArrayList<ArrayList<Integer>>) ansList.stream().sorted(Comparator.comparingInt(list -> list.get(0)))
				.collect(Collectors.toList());
	}
}
