package dependency;

public class Player {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public void play(Die die) {
		die.roll();
	}
}
