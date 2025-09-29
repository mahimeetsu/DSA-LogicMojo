package com.dsa.maths;

public class PowXN {

	public static void main(String[] args) {
		double x = 2.00000;
		int n = -2147483646;
		//System.out.println(myPow(x, n));
		System.out.println(myPowOptimalSquareBaseDevideExpoBy2(x, n));

	}

	/*
	 * TC:O(n)
	 */
	public static double myPow(double x, int n) {
		double res = 1;
		int temp;
		if (n < 0)
			temp = n * -1;
		else
			temp = n;

		for (int i = 1; i <= temp; i++) {
			res = res * x;
		}
		if (n < 0)
			return 1 / res;
		else
			return res;
	}

	/*
	 * TC:O(logn)
	 * 	8    4    4     4
	 * 2  = 2  * 2   = 4
	 *  4     2      1
	 * 4  = 16  = 251
	 */
	public static double myPowOptimalSquareBaseDevideExpoBy2(double x, int n) {
		double res=1;
		int temp=Math.abs(n);
		//if expo is odd , then we need to multply res with extra 2
		/*  9    4     4     1
		 * 2  = 2  *  2  *  2
		 *        4    1    2    1        1   1
		 *     = 4  * 2 = 16  * 2   =  256 * 2 =512
		 */
		while(temp>=1)
		{
			if(temp%2==1)
				res=res*x;
			x=x*x;
			temp=temp/2;
		}
		if(n<0)
		return 1/res;
		else
		return res;
	}

}
