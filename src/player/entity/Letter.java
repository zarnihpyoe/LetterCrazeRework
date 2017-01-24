/**
 * 
 */
package player.entity;

/**
 * @author Zarni Phyo
 *
 */
public class Letter {

	private final String character;
	private final int points;
	
	
	public Letter(String letter, int points)
	{
		this.character = letter.toUpperCase();
		this.points = points;
	}

	
	// getters and setters
	public String getChar() { return character; }
	public int getPoints() { return points; }

}
