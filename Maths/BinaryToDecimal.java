package com.dsa.maths;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int b = 111;
		System.out.println(binaryToDecimalUsingInbuiltMethod(b));
		System.out.println(binaryToDecimalUsingStringPow(b));
		System.out.println(binaryToDecimalUsingModPow(b));

	}

	/*
	 * The time complexity of Integer.parseInt() in Java is O(N), where N is the
	 * length of the input string. This is because the method internally iterates
	 * through each character of the input string to convert it into its
	 * corresponding integer value
	 */
	public static int binaryToDecimalUsingInbuiltMethod(int b) {
		int ans = 0;
		String temp = String.valueOf(b);
		ans = Integer.parseInt(temp, 2);
		return ans;
	}

	/*
	 * O(logn)
	 */
	public static int binaryToDecimalUsingStringPow(int b) {
		int ans = 0, p = 0;
		String s = String.valueOf(b);

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				ans = (int) (ans + Math.pow(2, p));
			}
			p++;
		}

		return ans;
	}

	/*
	 * O(logn)
	 */
	public static int binaryToDecimalUsingModPow(int b) {
		int ans = 0, p = 0;

		while (b > 0) {
			int rem = b % 10;
			if (rem == 1) {
				ans = (int) (ans + Math.pow(2, p));
			}
			p++;
			b = b / 10;
		}

		return ans;
	}
}
