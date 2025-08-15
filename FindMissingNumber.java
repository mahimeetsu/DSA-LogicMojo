package com.arrays;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		// System.out.println(missingNumber1(arr));
		// System.out.println(missingNumber2(arr));
		System.out.println(missingNumber3(arr));
	}

	// O(nlogn)
	public static int missingNumber1(int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] != i)
				return i;
		}
		// if missing element is at the end
		return n;
	}

	// O(n)
	public static int missingNumber2(int nums[]) {
		int allNElementsSum = 0;
		int n = nums.length;

		allNElementsSum = n * (n + 1) / 2;

		int arrElementsSum = 0;

		for (int i : nums) {
			arrElementsSum = arrElementsSum + i;
		}

		return allNElementsSum - arrElementsSum;
	}

	// O(n)
	public static int missingNumber3(int nums[]) {
		int res = 0;

		for (int i = 0; i < nums.length; i++) {
			res = res ^ nums[i];
		}
		for (int i = 1; i <= nums.length; i++) {
			res = res ^ i;
		}
		return res;
	}
}
