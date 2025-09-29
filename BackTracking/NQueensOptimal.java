package com.backtracking;
//solution-2

//This is the optimization of the issafe function. In the previous issafe function,
//we need o(N) for a row, o(N) for the column, and o(N) for the diagonal. Here, we will use hashing to maintain a list to check 
//whether that position can be the right one or not.

import java.util.ArrayList;
import java.util.List;

public class NQueensOptimal {
	public static void main(String[] args) {
		int n = 4;
		// Time Complexity: Exponential in nature since we are trying out all ways, to
		// be precise its O(N! * N).
		// Space Complexity: O(N)
		List<List<String>> ansQueen = solveNQueens(n);
		for (List<String> list : ansQueen) {
			for (String st : list) {
				System.out.println(st);
			}
			System.out.println();
		}
	}

	private static List<List<String>> solveNQueens(int n) {
		char[][] board = new char[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}

		List<List<String>> ans = new ArrayList<>();
		// leftside row
		int[] leftRow = new int[n];
		// upper diagonal
		int[] upperDiagonal = new int[2 * n - 1];
		// lower diagonal
		int[] lowerDiagonal = new int[2 * n - 1];
		// start with 0th col(1st arg)
		solve(0, board, ans, leftRow, lowerDiagonal, upperDiagonal);
		return ans;
	}

	private static void solve(int col, char[][] board, List<List<String>> ans, int[] leftRow, int[] lowerDiagonal,
			int[] upperDiagonal) {
		if (col == board.length) {
			ans.add(construnct(board));
			return;
		}

		for (int row = 0; row < board.length; row++) {
			if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0
					&& upperDiagonal[board.length - 1 + row - col] == 0) {
				board[row][col] = 'Q';
				leftRow[row] = 1;
				lowerDiagonal[row + col] = 1;
				upperDiagonal[board.length - 1 + row - col] = 1;
				solve(col + 1, board, ans, leftRow, lowerDiagonal, upperDiagonal);
				board[row][col] = '.';
				leftRow[row] = 0;
				lowerDiagonal[row + col] = 0;
				upperDiagonal[board.length - 1 + row - col] = 0;
			}
		}
	}

	public static List<String> construnct(char board[][]) {
		List<String> res = new ArrayList<String>();

		for (int i = 0; i < board.length; i++) {
			String s = new String(board[i]);
			res.add(s);
		}

		return res;
	}

}
