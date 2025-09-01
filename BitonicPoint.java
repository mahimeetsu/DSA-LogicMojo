package com.arrays;

public class BitonicPoint {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 7, 8, 3 };
		System.out.println(findBitonic(arr));
	}

	public static int findBitonic(int arr[]) {
		int ans = 0;

		int l = 0, r = arr.length - 1;
		int n = arr.length - 1;
		while (l <= r) {
			int mid = (l + (r - l) / 2);
			// found
			if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				ans = arr[mid];
				break;
			}
			// mid is at left side
			else if (mid > 0 && mid < n - 1 && arr[mid] < arr[mid + 1])
				l = mid + 1;
			// mid is at right side
			else
				r = mid - 1;
		}

		return ans;
	}
}
