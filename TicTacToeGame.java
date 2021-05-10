import java.util.*;

/**
 *  @description Class for defining the TicTacToeGame
 *  @param None
 *  
 */
public class TicTacToeGame {
	static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPosition = new ArrayList<Integer>();
	
	public static void printBoard(char[][] gameBoard) {

		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	

	public static void makeMove(char[][] gameBoard, int playerPos, String user) {

		char symbol = ' ';

		if (user.equals("Player")) {
			symbol = 'X';
		} else if (user.equals("computer")) {
			symbol = 'O';
		}

		switch (playerPos) {
		case 1:
			gameBoard[0][0] = symbol;
			break;
		case 2:
			gameBoard[0][2] = symbol;
			break;
		case 3:
			gameBoard[0][4] = symbol;
			break;
		case 4:
			gameBoard[1][0] = symbol;
			break;
		case 5:
			gameBoard[1][2] = symbol;
			break;
		case 6:
			gameBoard[1][4] = symbol;
			break;
		case 7:
			gameBoard[2][0] = symbol;
			break;
		case 8:
			gameBoard[2][2] = symbol;
			break;
		case 9:
			gameBoard[2][4] = symbol;
			break;
		default:
			break;
		}

	}
	
	public static void tossPlay() {
	    int player;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Toss H or T:");
	    String toss = sc.next();
	    
	    if ((toss.equals("H")) ) {
	        System.out.println("Congratulations! You've won the Toss.");
	        player = 1;
	    } else if(toss.equals("T")) {
	        System.out.println("You've lost Toss. Computer plays first.");
	        player = 0;
	    }
	}
	

	public static void main(String[] args) {

		char[][] gameBoard = { { '_', '|', '_', '|', '_' }, { '_', '|', '_', '|', '_' }, { ' ', '|', ' ', '|', ' ' } };
		printBoard(gameBoard);

		tossPlay();
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the placments from 1-9: ");
			int playerPos = sc.nextInt();
			while (playerPosition.contains(playerPosition) || cpuPosition.contains(playerPosition)) {
				System.out.println("position taken! please enter at other place");
				playerPos = sc.nextInt();
			}

			makeMove(gameBoard, playerPos, "Player");

			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			while (playerPosition.contains(cpuPos) || cpuPosition.contains(cpuPos)) {
				System.out.println("position taken! please enter at other place");
				cpuPos = rand.nextInt(9) + 1;
			}
			makeMove(gameBoard, cpuPos, "computer");

			printBoard(gameBoard);
			

		}
	}
}
