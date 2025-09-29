package com.dsa;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = { 12, 78, 45, 34, 2 };
		selectionSort(a, a.length);
		System.out.println(Arrays.toString(a));
	}

	public static void selectionSort(int a[], int n) {
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}
}
