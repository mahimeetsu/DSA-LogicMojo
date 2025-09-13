package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementNBy3 {
	public static void main(String[] args) {
		int nums[] = { 0,0,0};
		// System.out.println(majorityElementUsingMap(nums));
		System.out.println(majorityElementUsingMooreVotingAlgo(nums));
	}

	public static List<Integer> majorityElementUsingMap(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> ansList = new ArrayList<>();
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > nums.length / 3)
				ansList.add(entry.getKey());
		}
		return ansList;
	}

	public static List<Integer> majorityElementUsingMooreVotingAlgo(int[] nums) {
		int votes1 = 0, votes2 = 0, cand1 = Integer.MIN_VALUE, cand2 = Integer.MIN_VALUE, n = nums.length;
		List<Integer> ansList = new ArrayList<>();
		for (int i : nums) {
			if (votes1 == 0 && cand2 != i) {
				cand1 = i;
				votes1++;
			} else if (votes2 == 0 && cand1 != i) {
				cand2 = i;
				votes2++;
			} else if (i == cand1) {
				votes1++;
			} else if (i == cand2) {
				votes2++;
			} else {
				votes1--;
				votes2--;
			}
		}

		System.out.println(cand1 + " " + votes1);
		System.out.println(cand2 + " " + votes2);

		int count1 = 0, count2 = 0;

		for (int j : nums) {
			if (cand1 == j) {
				count1++;
			}
			if (cand2 == j) {
				count2++;
			}
		}

		System.out.println(count1 + " " + count2);

		if (count1 > n / 3) {
			ansList.add(cand1);
		}
		if (count2 > n / 3) {
			ansList.add(cand2);
		}
		return ansList;
	}
}
