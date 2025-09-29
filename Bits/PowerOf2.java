package com.dsa.bits;

public class PowerOf2 {
	public static void main(String[] args) {
		int n = 2;
		System.out.println(isPowerOfTwo(n));
	}

	public static boolean isPowerOfTwo(int n) {

		return n % 2 == 0;

	}
}
