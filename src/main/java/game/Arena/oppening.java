package game.Arena;

import java.util.*;

public class oppening {

	static Scanner in = new Scanner(System.in);

	public static void intro() {

		boolean running = true;
		String answer;

		Data Player1 = new Data(250, 250, "Man", 250, 0);
		Data Player2 = new Data(350, 350, " *Man (Normal)", 350, 0);
		Data Player3 = new Data(450, 450, " **Man (Strong)", 450, 0);
		Data Player4 = new Data(550, 550, " ***Man(Strongest)", 550, 0);
		Data Player5 = new Data(650, 650, " ****Man(Supernatural)", 650, 0);
		Data Player6 = new Data(850, 850, " *****Man(Legend)", 850, 0);

		System.out.println("Welcome to Fight Game " + "\nPlease  Add The Name");

		Player1.setName(in.nextLine().toUpperCase());

		System.out.println(
				"Are You Ready:" + Player1.getName() + " " + "\nAs Start Your Power& Heath & Defance Will be 2500 "
						+ "\nYou Will Get 2000 Points If You Win" + "\n^Be Ready Players Uploading");

		while (running) {

			do {

				System.out.println("Please Select the Player you wanna fight & type the fighter number ");

				System.out.println("1:" + "" + Player2.getName());
				System.out.println("2:" + "" + Player3.getName());
				System.out.println("3:" + "" + Player4.getName());
				System.out.println("4:" + "" + Player5.getName());
				System.out.println("5:" + "" + Player6.getName());

				int Selection = in.nextInt();

				switch (Selection) {

				case 1:

					System.out.println("Are You Ready To Fight " + Player2.getName());
					Calculation.ResultCalculation(Player1, Player2);
					running = false;
					break;

				case 2:

					System.out.println("Are You Ready To Fight " + Player3.getName());
					Calculation.ResultCalculation(Player1, Player3);
					running = false;
					break;

				case 3:

					System.out.println("Are You Ready To Fight " + Player4.getName());
					Calculation.ResultCalculation(Player1, Player4);
					running = false;
					break;

				case 4:

					System.out.println("Are You Ready To Fight " + Player5.getName());
					Calculation.ResultCalculation(Player1, Player5);
					running = false;
					break;

				case 5:

					System.out.println("Are You Ready To Fight " + Player6.getName());
					Calculation.ResultCalculation(Player1, Player6);
					running = false;
					break;

				default:
					System.out.println(" Wrong Entry Try Again Pls Select 1 Or 2 Or 3 Or 4 ");
					running = true;
				}

			} while (running == true);

			System.out.println("Do You Want To Give Up Or Play Again ? (Y/N)");
			answer = PlayMore.GetPlayAgainAnswer().toUpperCase();
			running = PlayMore.PlayAgain(answer);
			Player1.setRound(1);
		}
	}
}
