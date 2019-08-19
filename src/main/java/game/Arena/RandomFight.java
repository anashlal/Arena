package game.Arena;

import java.util.Random;

public class RandomFight {

	public static Random A = new Random();

	public static int getRandomAttackPower() {

		int MIN = 10;
		int MAX = 200;
		int RandomAttackPower = A.nextInt(MAX - MIN) + MIN;
		return RandomAttackPower;
	}
}