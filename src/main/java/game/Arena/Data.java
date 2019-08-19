package game.Arena;



public class Data<Player> {

	private int Power = 0;
	private int Defance = 0;
	private String Name;
	private int Health = 0;
	private int round = 1;

	public Data(int Power, int Defance, String Name, int Health, int round) {

		this.Power = Power;
		this.Defance = Defance;
		this.Name = Name;
		this.Health = Health;
		this.round = round;

	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public int getDefance() {
		return Defance;
	}

	public void setDefance(int defance) {
		Defance = defance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public  int getHealth() {
		return Health;
	}

	public void setHealth(int health) {
		Health = health;
	}

	public int getRound() {
		round++;
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Defance;
		result = prime * result + Health;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + Power;
		result = prime * result + round;
		return result;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data<?> other = (Data<?>) obj;
		if (Defance != other.Defance)
			return false;
		if (Health != other.Health)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Power != other.Power)
			return false;
		if (round != other.round)
			return false;
		return true;
	}
	
	
	
	    public int AttackPower;
		public PlayMore Player1;
		public PlayMore Player2;
		public PlayMore WinnerPlayer;
		public int RoundCount = 0;
		
		public Data(Player player1, Player player2) {
			this.Player1 = (PlayMore) player1;
			this.Player2 = (PlayMore) player2;
		}
		
		public void StartRound() {
			
			while(!this.Player1.IsPlayerDead() && !this.Player2.IsPlayerDead())
			{
				int player1IncreaseRandomePower = 2;
				int player1NewPower = this.Player1.getPowerAfterIncrease(player1IncreaseRandomePower);
				
				int player2IncreaseRandomePower = 3;
				int player2NewPower = this.Player2.getPowerAfterIncrease(player2IncreaseRandomePower);
				
				Player attackWinnerResult = this.Fight(player1NewPower, player2NewPower);
				
				this.RoundCount++;
				
				if(this.Player1.IsPlayerDead() || this.Player2.IsPlayerDead())
				{
					this.WinnerPlayer = (PlayMore) attackWinnerResult;
					this.WinnerPlayer.PrintPlayerStatus();
				}
			}
			
			this.PrintRoundResult();
		}
		
		public void PrintRoundResult() {
			System.out.println(this.WinnerPlayer + " after " + this.RoundCount + " round(s).");
		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Player Fight(int player1Power, int player2Power) {
			Player attacker = null;
			Player defence = null;
			
			if(player1Power > player2Power) {
				attacker = (Player) this.Player1;
				defence = (Player) this.Player2;
				((Data) defence).DecreaseHealth(attacker);
				
				// Player 1 Win This Round
			} else if (player1Power < player2Power) {
				attacker = (Player) this.Player2;
				defence = (Player) this.Player1;
				((Data) defence).DecreaseHealth(attacker);
				// Player 2 Win This Round
			} else  {
				// No One Win
			}
			return attacker;
		}
		
	
			
			
			private void DecreaseHealth(Player attacker) {
			
		}

			public boolean IsPlayerDead() {
				return this.Health <= 0;
			}
			
			public int getPowerAfterIncrease(int increaseValue)
			{
				return this.Power + increaseValue;
			}
			
			public void DecreaseHealth(int value) {
				this.Health -= value;
			}
			
			public void PrintPlayerStatus()
			{
				System.out.println("Player Name: " + this.Name);
				System.out.println("Player Health: " + this.Health);
				System.out.println("Player Power: " + this.Power);
				System.out.println("Player Attack Power: " + this.AttackPower);
			}
		
	


	@Override
	public String toString() {
		return "Data [Power=" + Power + ", Defance=" + Defance + ", Name=" + Name + ", Health=" + Health + ", round="
				+ round + "]";
	}
	}

