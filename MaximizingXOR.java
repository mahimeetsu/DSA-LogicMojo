package com.dsa.bits;

public class MaximizingXOR {
	public static void main(String[] args) {
		int l = 10, r = 11;
		System.out.println(maximizingXorNestedLoops(l, r));
		System.out.println(maximizingXor(l, r));
	}

	public static int maximizingXorNestedLoops(int l, int r) {
		System.out.println("Using nested loops:");
		int res = 0;
		int ans = Integer.MIN_VALUE;
		for (int i = l; i<=r; i++) {
			for (int j = i; j <= r; j++) {
				res = i ^ j;
				System.out.println(i + "^" + j + "=" + res);
				ans = Math.max(ans, res);
			}
		}
		return ans;
	}

	public static int maximizingXor(int l, int r) {
		System.out.println("Using single loop:");
		int res = 0;
		int temp = r;
		int ans = Integer.MIN_VALUE;
		while (l <= r) {
			res = (l ^ r);
			ans = Math.max(ans, res);
			System.out.println(l + "^" + r + "=" + res);
			r--;
			if (l == r) {
				l++;
				r = temp;
			}
		}
		return ans;
	}
}
