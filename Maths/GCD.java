package com.dsa.maths;

public class GCD {
	public static void main(String[] args) {
		int a = 36, b = 60;
		System.out.println(gcd1(a, b));
		System.out.println(gcd2(a, b));
		System.out.println(gcdOptimalEcludean(a, b));
		System.out.println(gcdOptimalEcludean1(a, b));
		System.out.println(gcdOptimalEcludeanRecursion(a, b));

	}

	// TC: O(min(a,b))
	// SC:O(1)
	public static int gcd1(int a, int b) {
		int ans = 1;
		for (int i = 1; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				ans = i;
			}
		}
		return ans;
	}

	// TC: O(min(a,b))
	// SC:O(1)
	public static int gcd2(int a, int b) {

		for (int i = Math.min(a, b); i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;
	}

	// TC: O(log(min(a,b)))
	// SC:O(1)
	public static int gcdOptimalEcludean(int a, int b) {

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

	// TC: O(log(min(a,b)))
	// SC:O(1)
	public static int gcdOptimalEcludean1(int a, int b) {
		// here b is replaced by a devided by b , and a is replaced by previous value of
		// b
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// TC: O(log(min(a,b)))
	// SC:O(log(min(a,b)))
	public static int gcdOptimalEcludeanRecursion(int a, int b) {
		if (b == 0)
			return a;
		return gcdOptimalEcludeanRecursion(b, a % b);
	}
}
