package game;
import java.util.Random;
/** 
* Game of guessing a secret number.
 * @author Triwith Mutitakul             
 */

public class GuessingGame {
	/* properties of a guessing game */
	public int upperBond;
	public int secret;
	public String hint;
	public int count = 1;
	/**
	 * Initialize a new game.
	 * @param upperbound is the max value for the secret number (>1).
	 */

	public GuessingGame(int upperBond){// this is a constructor
		this.upperBond=upperBond;
	}
	
	/** 
	 * Create a random number between 1 and upperBond.
	 * @param upperBond is the upper limit for random number
	 * @return a random number between 1 and upperBond (inclusive)
	 */
	public int getRandomNumber(int upperBond){
		long seed = System.currentTimeMillis( );
		Random rand = new Random( seed );
		
		return this.secret = (rand.nextInt(upperBond) + 1);

	}
	/**check the input number. Correct or not.
	 * 
	 * @param number is a number that player guess.
	 * @return the number that player guess is true or false.
	 */
	public boolean guess(int number){
		if(number==secret){
			return true;
		}
		else{
			return false;
		}
	}
	/**check the answer and choose the hint for player.
	 * 
	 * @param number is a number that player guess.
	 */
	public void setHint(int number){
		if(number>secret){
			 hint = "Sorry, you're guess is too large.";
		}
		else {
			hint =  "Sorry, you're guess is too small.";
		}
	}
	/** 
	 * Return a hint based on the most recent guess.
	 * @return hint based on most recent guess
	 */

	public String getHint(){
		return this.hint;
		
	}
	/**return number of guess that player used.
	 * 
	 * @return number of guess that player used.
	 */
	public int getCount(){
		return this.count;
	}
	/**count the number of guess that player guess.
	 * 
	 */
	public void setCount(){
		count = this.count+1;
	} 


}
