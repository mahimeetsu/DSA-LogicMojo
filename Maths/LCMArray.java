package com.dsa.maths;

public class LCMArray {
	public static void main(String[] args) {
		int n = 4, a[] = { 2, 8, 3, 6, 9 };
		System.out.println(lcmOfArray(n, a));
	}

	public static long lcmOfArray(int N, int A[]) {
		long ans = A[0];
		long MOD = 1000000007;

		for (int i = 1; i < A.length; i++) {
			ans = lcm(ans, A[i]);
		}

		return ans % MOD;
	}

	public static long lcm(long a, long b) {
		return (long) a * b / gcd(a, b);
	}

	public static long gcd(long a, long b) {

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
