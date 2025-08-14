package com.dsa.bits;

public class FlippingBits {
	public static void main(String[] args) {
		long n = 2147483647;
		System.out.println(flip(n));
	}
	/*
	 * 1 bit can store two values = 0,1
	 * 2 bit can store four values = 00,01,10,11
	 * ..
	 * ..										     
	 * n bit can store 2 to the power of n valuse= 2^n
	 * 
	 * if there are 32 bits, then it can store 2^32
	 * we are storing unsigned integer,so all 32 bits are used for storing value of the integer
	 * 
	 * one of the value is 0, so the max value that can be stored is 2^32-1
	 */
	public static long flip(long n) {
		long res = (long) (Math.pow(2, 32) - 1);

		return res ^ n;
	}
}
