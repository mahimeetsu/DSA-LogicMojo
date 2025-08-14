package com.dsa.bits;

public class GreatXor {
	public static void main(String[] args) {
		// a^x>x
		// 0<a<x
		long x = 10;
		// System.out.println(theGreatXor(x));
		System.out.println(theGreatXor1(x));

	}

	public static long theGreatXor(long x) {
		long res = 0;

		long a = 1;
		long count = 0;
		while (a < x) {
			res = a ^ x;
			if (res > x) {
				count++;
			}
			a++;
		}

		return count;
	}

	/*
	 * step-1 : convert the number i.e x into binary form(bits)
	 * step-2 :find the length
	 * step-3: find 2^length-1(all setbits)
	 * step-4: substract x from 2^length-1
	 * 
	 * example: x=10
	 * step-1: String binary="1010";
	 * step-2:length=4
	 * step-3:res=2^length-1=2^4-1=16-1=15(1111)
	 * step-4:res-x=15-10=5
	 * 
	 */
	public static long theGreatXor1(long x) {
		String binaryString = Long.toBinaryString(x);
		System.out.println(binaryString);
		int length = binaryString.length();
		long res = (long) Math.pow(2, length) - 1;
		return res - x;
	}
}
