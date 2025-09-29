package com.dsa;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 4, 6, 2, 8, 1, 5, 7, 3 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("After Sorting:" + Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pIndex = partition(arr, low, high);
			quickSort(arr, low, pIndex - 1);
			quickSort(arr, pIndex + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i = low;
		int j = high;

		while (i < j) {
			while (a[i] <= pivot && i < high) {
				i++;
			}
			while (a[j] > pivot && j > low) {
				j--;
			}
			if (i < j) {
				swap(a, i, j);
			}
		}
		swap(a, low, j);
		return j;
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
