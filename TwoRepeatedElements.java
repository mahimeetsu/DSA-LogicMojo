package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoRepeatedElements {
	public static void main(String[] args) {
		int n = 4, arr[] = { 9, 1, 5, 6, 4, 3, 10, 8, 4, 2, 2, 7 };
		// System.out.println(Arrays.toString(twoRepeatedUsingLoops(arr)));
		// System.out.println(Arrays.toString(twoRepeatedUsingSet(arr)));
		// System.out.println(Arrays.toString(twoRepeatedUsingCycleSort(arr)));
		System.out.println(Arrays.toString(twoRepeatedUsingIndex(arr)));
	}

	public static int[] twoRepeatedUsingLoops(int arr[]) {
		int ans[] = new int[2];
		int n = arr.length;
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					ans[index++] = arr[j];
				}
			}
		}
		return ans;
	}

	public static int[] twoRepeatedUsingSet(int arr[]) {
		int ans[] = new int[2];
		int n = arr.length;
		Set<Integer> set = new HashSet();
		int index = 0;
		for (int num : arr) {
			if (!set.add(num)) {
				ans[index++] = num;
			}
		}
		return ans;
	}

	public static int[] twoRepeatedUsingCycleSort(int arr[]) {
		// 1, 2, 1, 3, 4, 3
		int ans[] = new int[2];
		int n = arr.length;
		int i = 0;
		while (i < n) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
		int c = 0;
		for (i = 0; i < n; i++) {
			if (arr[i] != i + 1) {
				ans[c++] = arr[i];
			}
		}
		return ans;
	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static int[] twoRepeatedUsingIndex(int arr[]) {
		int ans[] = new int[2];
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			int index = Math.abs(arr[i]);
			if (arr[index] > 0)
				arr[index] = -arr[index];
			else
				ans[c++] = arr[index];
		}
		return ans;

	}
}
