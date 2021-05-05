import java.util.*;
/**
 *  @description Class for defining the TicTacToeGame
 *  @param None
 *  
 */
public class TicTacToeGame {
	/**
	 *  @description Private Method to create a board for TicTacToeGame Class
	 *  @param None
	 *  
	 */
	private static char[] createBoard() {
		char[] board = new char[10];
		for(int i=1; i<board.length; i++) {
			board[i]= ' ';	
		}
		return board;
	}
	public static void main(String[] args) {
		createBoard();
	}
}
