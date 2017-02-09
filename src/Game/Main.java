package game;
/**
 * The main class that used for call and start the Guessing game
 * @author Triwith Mutitakul
 *
 */
public class Main {
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
