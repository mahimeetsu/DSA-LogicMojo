// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1;;
        while(l<r)
        {
            while(l<n&&arr[l]==0)
            {
                l++;
            }
            while(r>=0&&arr[r]==1)
            {
                r--;
            }
            if(l<r)
            {
                swap(arr,l,r);
            }
        }
    }
    
    public void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
