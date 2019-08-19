package game.Arena;

public class Calculation {

	public static Calculation ResultCalculation(Data A, Data B) {

		boolean IsAlive = true;

		while (IsAlive) {

			System.out.println(A.getName() + " " + "Attack");
			
			int player1RandomPower = RandomFight.getRandomAttackPower();
			
			A.setPower(A.getPower() - player1RandomPower);
			
			int NewDefance2 = B.getDefance() - player1RandomPower;
			int newHealth2 = B.getHealth() - (player1RandomPower);
			
			B.setDefance(NewDefance2);
			B.setHealth(newHealth2);
			
			System.out.println(B.getName() + " " + "Attack");
			int player2RandomPower = RandomFight.getRandomAttackPower();
			
			B.setPower(B.getPower() - player2RandomPower);
			int NewDefance1 = A.getDefance() ;
			int newHealth1 = A.getHealth() - (player2RandomPower);
			A.setDefance(NewDefance1);
			A.setHealth(newHealth1);
			
			System.out.println(A.getName() + " " + "Power Is :" + "  " + A.getPower());
			System.out.println(A.getName() + " " + "Health Is :" + "  " + A.getHealth());
			System.out.println(A.getName() + " " + "Defance Is :" + "  " + A.getDefance());
			System.out.println(B.getName() + " " + "Power Is :" + " " + B.getPower());
			System.out.println(B.getName() + " " + "Health Is :" + " " + B.getHealth());
			System.out.println(B.getName() + " " + "Defance Is :" + " " + B.getDefance());
			System.out.println("Number Of Rounds " + " " + A.getRound());

			if (A.getHealth() <= 0 || A.getDefance() <= 0 || A.getPower() <= 0) {
				System.out.println(
						"You Lost" + " " + A.getName() + " " + "After :" + " " + (A.getRound() - 1) + " " + "Rounds");

				A.setDefance(+3000);
				A.setHealth(+3000);
				A.setPower(+3000);
				A.setRound(A.getRound());
				B.setHealth(+3000);
				B.setPower(+3000);
				B.setDefance(+3000);
				B.setRound(B.getRound());
				IsAlive = false;
			}

			if (B.getHealth() <= 0 || B.getDefance() <= 0 || B.getPower() <= 0) {
				System.out.println("You Win" + " " + A.getName() + " " + "& " + " " + B.getName() + "  Lost "
						+ "After :" + " " + (A.getRound() - 1) + " " + "Rounds");
				System.out.println("You Get 2000 Points Will Add To Your Health & Power & Defance"
						+ "\nYour Enemy will Get 1000 Will Add To His Health & Power & Defance ");

				A.setHealth(A.getHealth() + 2000);
				A.setPower(A.getPower() + 2000);
				A.setDefance(A.getDefance() + 2000);
				B.setHealth(B.getHealth() + 1000);
				B.setPower(B.getPower() + 1000);
				B.setDefance(B.getDefance() + 1000);
				A.setRound(A.getRound());
				B.setRound(B.getRound());
				IsAlive = false;

				if (A.getHealth() >= 10000 || A.getDefance() >= 10000 || A.getPower() >= 10000) {
					System.out.println("Your Player Upgraded To Level 2");
					player1RandomPower = player1RandomPower * 2;
				}

				if (A.getHealth() >= 20000 || A.getDefance() >= 20000 || A.getPower() >= 20000) {
					System.out.println("Your Player Upgraded To Level 3");
				}
			}
		}
		return null;
	}
}
