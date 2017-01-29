package game;
import java.util.Scanner;
import java.util.Random;
public class GameConsole {
	/** called object GuessingGame and use it. 
	 * 
	 * @param game called the object GuessingGame.
	 * @return the correct number.
	 */
	public int play(GuessingGame game){
		
		game.getRandomNumber(20);
		Scanner sc = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1 and "+game.upperBond);
		boolean condit=true;
		do{
			System.out.print("What is your guess? :");
			int input = sc.nextInt();
			game.setHint(input);
			if(game.guess(input)){
				condit = false;
				break;
			}
			else{
				System.out.println(game.hint);
			}
			
		game.setCount();
			
			
		}while(condit);
		System.out.println("Right! The secret is "+game.secret);
		System.out.println("You used "+game.getCount()+" guesses.");
		String input = sc.next();
		return game.secret;
		
	}

}
