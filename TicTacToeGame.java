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
			board[i]= '_';	
		}
		return board;
	}
	/**
	 *  @description Private Method to choose letter for TicTacToeGame Class
	 *  @param None
	 *  
	 */
	private static char chooseLetter() {
		Scanner sc = new Scanner(System.in);
		char input = sc.next().toUpperCase().charAt(0);
		if(input == 'X') {
			System.out.println("choosen symbol is: "+input);
			System.out.println("choosen symbol by computer is: O");
		}
		else if(input == 'O'){
			System.out.println("choosen symbol is: "+input);
			System.out.println("choosen symbol by computer is: X");
		}
		else {
			System.out.println("Invalid symbol");
		}
		return input;
	}
	
	/**
	 *  @description Private Method to show Board to display current Board
	 *  @param None
	 *  
	 */
	private static void showBoard() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(createBoard());
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		createBoard();
		chooseLetter();
		showBoard();
	}
}
