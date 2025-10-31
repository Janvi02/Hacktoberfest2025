package Backtracking;

public class N_Queen {

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];
		QueenSitting(board, n, 0);
		// TODO Auto-generated method stub
	}
	public static void QueenSitting(boolean[][] board, int tq, int row ) {
		if(tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for(int col = 0; col < board.length; col++) {
			if(Issafe(board, row, col) == true) {
				board[row][col] = true;
				QueenSitting(board, tq - 1, row + 1);
				board[row][col] = false;
			}
		}
	}
	private static boolean Issafe(boolean[][] board, int row, int col) {
		//up
		int r = row;
		while(r >= 0) {
			if(board[r][col] == true) {
				return false;
			}
			r--;
		}
		//left diagonal
		r = row;
		int c = col;
		while(r >= 0 && c >= 0) {
			if(board[r][col] == true) {
				return false;
			}
			r--;
			c--;
		}
		//right diagonal
	    r = row;
	    c = col;
	    while(r >= 0 && col < board[0].length) {
	    	if(board[r][col] == true) {
				return false;
			}
	    	r--;
	    	c++;
	    }
		return true;
	}
	public static void Display(boolean[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board.length; j++) {
				System.out.println(board[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
