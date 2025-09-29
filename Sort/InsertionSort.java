package com.dsa;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 6, 5, 3, 2, 1 };
		insertionSort(arr, arr.length);
		System.out.println("After Sorting:" + Arrays.toString(arr));
	}

	public static void insertionSort(int a[], int n) {
		for (int i = 0; i < n; i++) {
			int j = i;
			while (j > 0 && a[j - 1] > a[j]) {
				int temp = a[j - 1];
				a[j - 1] = a[j];
				a[j] = temp;
				j--;
			}
		}
	}
}
