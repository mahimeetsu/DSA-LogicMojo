package com.dsa.maths;

public class LCM {
	public static void main(String[] args) {
		int a = 4, b = 6;
		System.out.println(lcm1(a, b));
		System.out.println(lcmOptimal(a,b));
		//System.out.println(gcd(a, b));

	}

	public static int lcm1(int a, int b) {
		int ans = Integer.MAX_VALUE;
		int res = Math.max(a, b);
		while (true) {
			if (res % a == 0 && res % b == 0) {
				ans = res;
				break;
			}
			res++;
		}
		return ans;
	}
	/*
	 * lcm(a,b)*gcd(a,b)=a*b
	 * 12*2=4*6
	 * 24=24
	 * 
	 * lcm(a,b)=(a*b)/gcd(a,b)
	 */
	public static int lcmOptimal(int a, int b) {
		int ans = 1;
		return (a*b)/gcd(a, b);
	}
	public static int gcd(int a, int b) {

		while (a > 0 && b > 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}
		if (a == 0)
			return b;
		return a;
	}
}
