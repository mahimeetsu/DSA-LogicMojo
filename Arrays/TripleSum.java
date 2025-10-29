Given an array arr[] and an integer target, determine if there exists a triplet in the array whose sum equals the given target.

Return true if such a triplet exists, otherwise, return false.

Examples: 

Input: arr[] = [1, 4, 45, 6, 10, 8], target = 13
Output: true 
Explanation: The triplet {1, 4, 8} sums up to 13.
Input: arr[] = [1, 2, 4, 3, 6, 7], target = 10
Output: true 
Explanation: The triplets {1, 3, 6} and {1, 2, 7} both sum to 10. 
Input: arr[] = [40, 20, 10, 3, 6, 7], target = 24
Output: false 
Explanation: No triplet in the array sums to 24.

================================


o(n^3) o(1)

boolean hasTripletSum(int[] arr, int target) {
        int n = arr.length;
        
        // Fix the first element as arr[i]
        for (int i = 0; i < n - 2; i++) {
            
            // Fix the second element as arr[j]
            for (int j = i + 1; j < n - 1; j++) {
                
                // Now look for the third number
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target)
                        return true; // If a triplet is found
                }
            }
        }

        return false;
}

================
O(n^2) Time and O(n) Space

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
    int n=arr.length;
    for(int i=0;i<n-2;i++)
    {
        Set<Integer> set=new HashSet<>();
        for(int j=i+1;j<n;j++)
        {
            int third=target-arr[i]-arr[j];
            if(set.contains(third))
            {
                return true;
            }
            set.add(arr[j]);
        }
    }
    
    return false;
    }
}


============

O(n^2) Time and O(1) Space

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
    int n=arr.length;
    Arrays.sort(arr);
    for(int i=0;i<n-2;i++)
    {
        //intialize left and right pointers with start and end of remaining subarray
        int l=i+1,r=n-1;
        int targetSum=target-arr[i];
        while(l<r)
        {
            if(arr[l]+arr[r]==targetSum)
                return true;
            if(arr[l]+arr[r]<targetSum)
                l++;
            else
                r--;
        }
       
    }
    
    return false;
    }
}
