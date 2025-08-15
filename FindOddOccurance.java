package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindOddOccurance {
	public static void main(String[] args) {
		int a[] = { 6, 6, 4, 6, 5, 5, 4, 6, 6 };
		System.out.println(findOddUsingMap(a, a.length));
		System.out.println(findOddUsingBits(a, a.length));

	}

	public static int findOddUsingMap(int arr[], int n) {
		Map<Integer, Integer> freqMap = new HashMap();

		for (int a : arr) {
			freqMap.put(a, freqMap.getOrDefault(a, 0) + 1);
		}

		System.out.println(freqMap);

		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() % 2 == 1) {
				return entry.getKey();
			}
		}

		return -1;
	}

	public static int findOddUsingBits(int arr[], int n) {
		int res = 0;

		for (int a : arr) {
			res = res ^ a;
		}

		return res;
	}
}
