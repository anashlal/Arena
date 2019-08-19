package game.Arena;

import java.util.*;

public class PlayMore {

	static Scanner in = new Scanner(System.in);

	static boolean PlayAgain(String answer) {

		String upperCaseString = answer.toUpperCase();
		switch (upperCaseString) {
		case "Y":
			System.out.println("welcome Back");
			return true;
		default:
			System.out.println("See You " );
			return false;
		}
	}

	public static String GetPlayAgainAnswer() {
		return in.nextLine();
	}

	public boolean IsPlayerDead() {
		return false;
	}

	public int getPowerAfterIncrease(int player1IncreaseRandomePower) {
		return 0;
	}

	public void PrintPlayerStatus() {

		
	}
}