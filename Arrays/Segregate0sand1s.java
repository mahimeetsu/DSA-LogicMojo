package com.arrays;

import java.util.Arrays;

public class Segregate0sand1s {
	public static void main(String[] args) {
		int a[] = { 0, 0, 1, 1, 0 };
		segregate0and1TwoPointer(a);
	}

	public static void segregate0and1TwoPointer(int[] arr) {
		int l = 0, r = arr.length - 1;

		while (l < r) {
			while (arr[l] == 0)
				l++;
			while (arr[r] == 1)
				r--;
			if (l < r)
				swap(arr, l, r);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
