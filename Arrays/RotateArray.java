package com.arrays;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 }, k = 3;
		rotate(nums, k);
	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length - 1;
		int temp[] = new int[k];
		for (int i = 0; i < k; i++) {
			temp[i] = nums[i];
		}
		System.out.println(Arrays.toString(temp));
		for (int i = k+1; i < n; i++) {
			nums[i] = nums[i];
		}
		System.out.println(Arrays.toString(nums));
	}
}
