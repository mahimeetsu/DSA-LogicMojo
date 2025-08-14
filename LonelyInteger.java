package com.dsa.bits;

import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2);
		System.out.println(lonelyintegerUsingMap(list));
		System.out.println(lonelyinteger(list));
	}

	public static int lonelyintegerUsingMap(List<Integer> a) {
		int ans = 0;
		for (int i = 0; i < a.size(); i++) {
			ans = ans ^ a.get(i);
		}
		return ans;
	}
	public static int lonelyinteger(List<Integer> a) {
		int ans = 0;
		for (int i = 0; i < a.size(); i++) {
			ans = ans ^ a.get(i);
		}
		return ans;
	}
}
