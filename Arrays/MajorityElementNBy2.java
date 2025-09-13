package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementNBy2 {
	public static void main(String[] args) {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElementUsingSorting(nums));
		System.out.println(majorityElementUsingMap(nums));
		System.out.println(majorityElementUsingMooreVotingAlgo(nums));
	}

	// o(nlog) o(1)
	public static int majorityElementUsingSorting(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	// o(n) o(n)
	public static int majorityElementUsingMap(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > nums.length / 2) {
				return entry.getKey();
			}
		}
		return -1;
	}

	// o(n) o(1)
	public static int majorityElementUsingMooreVotingAlgo(int[] nums) {
		int votes = 0, candidate = 0;

		for (int i : nums) {
			if (votes == 0) {
				candidate = i;
				votes++;
			} else if (i == candidate) {
				votes++;
			} else {
				votes--;
			}
		}

		return candidate;
	}
}
