package com.arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int nums[] = { -1, 0, 3, 5, 9, 12 }, target = 9;
		System.out.println(linearSearch(nums, target));
		System.out.println(binarySearch(nums, target));
	}

	public static int linearSearch(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				return i;
		}

		return -1;
	}

	public static int binarySearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = (low + (high - low) / 2);

			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}
