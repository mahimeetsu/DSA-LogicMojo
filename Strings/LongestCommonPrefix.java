package com.strings;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String strs[] = { "flower", "flow", "flight" };
		Arrays.sort(strs);
		int n = strs[0].length();
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < n; i++) {
		//	if (strs[0].charAt(i)!=strs[n].charAt(i)) {
			//	return ans.toString();
			//}
			//sb.append(strs[0].charAt(i));
		}
	}
}
