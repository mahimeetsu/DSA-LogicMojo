package com.backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 */
public class GenerateParantheses {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(generateParenthesis(3));
	}

	public static List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		recursionBackTrack(result, n, 0, 0, "");
		return result;
	}

	public static void recursionBackTrack(List<String> result, int n, int open, int close, String unProcessed) {
		if (unProcessed.length() == 2 * n) {
			result.add(unProcessed);
			return;
		}

		if (open < n) {
			recursionBackTrack(result, n, open + 1, close, unProcessed + "(");
		}

		if (close < open) {
			recursionBackTrack(result, n, open, close + 1, unProcessed + ")");
		}
	}
}
