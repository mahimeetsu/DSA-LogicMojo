package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 2, 2 };
		System.out.println(missingUsingSort(arr));
		System.out.println(missingUsingSet(arr));
		System.out.println(missingUsingMap(arr));
		System.out.println(missingUsingBits(arr));

	}
	//O(nlogn) o(1)
	public static int missingUsingSort(int nums[]) {

		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1])
				return nums[i];
		}
		return -1;
	}
	//o(n) o(n)
	public static int missingUsingSet(int nums[]) {
		Set<Integer> set = new HashSet<>();
		for (int n : nums) {
			if (!set.add(n))
				return n;
		}
		return -1;
	}
	//o(n) o(n)
	public static int missingUsingMap(int nums[]) {
		Map<Integer, Integer> freqMap = new HashMap<>();

		for (int i : nums) {
			freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
		}
	
		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() > 1) {
				return entry.getKey();
			}
		}
		return -1;
	}
	//o(n) o(1)
	public static int missingUsingBits(int nums[]) {
		int res = 0;

		for (int i = 0; i < nums.length; i++) {
			res = res ^ nums[i];
		}

		for (int i = 0; i < nums.length; i++) {
			res = res ^ i;
		}
		return res;
	}
}
