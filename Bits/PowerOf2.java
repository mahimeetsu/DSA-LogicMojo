package com.dsa.bits;

public class PowerOf2 {
	public static void main(String[] args) {
		int n = 2;
		System.out.println(isPowerOfTwo(n));
	}
	//logn
    public boolean isPowerOfTwo(int n) {
        if(n==0)
            return false;
        while(n>0)
        {
            if(n==1)
                return true;
            if(n%2!=0)
                break;
            n=n/2;
        }
        return false;
    }

	=======================
	//o(1)
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
=========================
	//o(1)
	public static boolean isPowerOfTwo(int n) {

       return n > 0 && (n & (n - 1)) == 0;

	}
}



