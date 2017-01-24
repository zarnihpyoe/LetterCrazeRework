/**
 * 
 */
package player.entity;

/**
 * @author Zarni Phyo
 *
 */
public class Tile {
	
	private Letter letter;
	
	public Tile()
	{
		
	}

	
	public void setRandomLetter(LetterGenerator lg)
	{
		letter = lg.generateRandomLetter();
	}
	
	public String getChar() { return letter.getChar(); }
	public int getPoints() {return letter.getPoints(); }
	
	// getters and setters
	public Letter getLetter() { return this.letter; }
	public void setLetter(Letter letter) { this.letter = letter; }

}
