/**
 * 
 */
package entity;

/**
 * @author Zarni Phyo
 *
 */
public class Letter {

	public static final Letter EMPTY = new Letter("", 0);
	
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
