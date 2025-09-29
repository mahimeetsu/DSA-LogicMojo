package com.dsa.maths;

public class PowerOfTwo {
	public static void main(String[] args) {
		int n = 8;
		System.out.println(isPowerOfTwoDevideBy2(n));
		System.out.println(isPowerOfTwoUsingPowFuction(n));
		System.out.println(isPowerOfTwoUsingBits(n));
	}

	// o(logn) o(1)
	public static boolean isPowerOfTwoDevideBy2(int n) {
		while (n > 0) {
			if (n == 1)
				return true;
			if (n % 2 != 0)
				break;
			n = n / 2;
		}
		return false;
	}

	// o(1) o(1)
	public static boolean isPowerOfTwoUsingPowFuction(int n) {
		for (int i = 0; i < 31; i++) {
			if ((int) Math.pow(2, i) == n)
				return true;
		}
		return false;
	}
	// o(1) o(1)
	// observation
	// binary format of numbers which are powers of 1
	// 1 1
	// 2 10
	// 4 100
	// 8 1000
	// 16 10000
	// 32 100000
	// here we could see all numbers have only one set bit and it is at the leftmost
	// bit

	// binary format of number-1 which are powers of 2
	// 1 1 0 0
	// 2 10 1 1
	// 4 100 3 11
	// 8 1000 7 111
	// 16 10000 15 1111
	// 32 100000 31 11111

	// so if we perfrom & on n and (n-1), we will get 0

	// example:
	// 8 and 8-1=7
	// 1000
	// 0111
	// ------
	// 0000
	public static boolean isPowerOfTwoUsingBits(int n) {
		return n > 0 && (n & (n - 1)) == 0;
	}
}
