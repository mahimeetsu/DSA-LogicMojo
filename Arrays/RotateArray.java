package com.arrays;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 }, k = 3;
		rotate(nums, k);
	}

	public static void rotateArray(int a[],int k)
	{
		int n=a.length;
		// Step 1: Store first k elements
		int temp[]=new int[k];
		for(int i=0;i<k;i++)
		{
			temp[i]=a[i];
		}
		System.out.println(Arrays.toString(temp));
		//shift remaining elements to left
		for(int i=k;i<n;i++)
		{
			a[i-k]=a[i];
		}
		System.out.println(Arrays.toString(a));
		 // Step 3: Copy temp elements to end
		for(int i=0;i<k;i++)
		{
			a[n-k+i]=temp[i];
		}
		System.out.println(Arrays.toString(a));
	};
	}
}

===========================

class Solution {
    public void rotate(int[] nums, int k) {
		//k is updated to k % n to handle cases where k is greater than n
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }    
}


