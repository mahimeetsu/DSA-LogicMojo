package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	public static void main(String[] args) {
		int arr[] = { 9, 4, 6, 2, 8, 1, 5, 7, 3 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("After Sorting:" + Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		List<Integer> tempList = new ArrayList<>();
		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				tempList.add(arr[left]);
				left++;
			} else {
				tempList.add(arr[right]);
				right++;
			}
		}

		while (left <= mid) {
			tempList.add(arr[left]);
			left++;
		}
		while (right <= high) {
			tempList.add(arr[right]);
			right++;
		}

		for (int i = low; i <= high; i++) {
			arr[i] = tempList.get(i - low);
		}
	}
}
