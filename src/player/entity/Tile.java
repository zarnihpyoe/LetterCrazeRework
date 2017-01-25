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
	private Tile below;
	
	public Tile()
	{
		this.letter = Letter.EMPTY;
	}
	
	public void isAbove(Tile tile)
	{
		below = tile;
	}

	public boolean isEmpty()
	{
		return letter.equals(Letter.EMPTY);
	}
	
	public void setRandomLetter(LetterGenerator lg)
	{
		letter = lg.generateRandomLetter();
	}
	
	public Letter extractLetter()
	{
		Letter l = letter;
		setLetter(Letter.EMPTY);
		return l;
	}
	
	// will be called for each selected tiles from Board when user remove a word
	public void pullUpLetter()
	{
		if(below == null) return;		// means bottom-most tile, can't pull anything up
		if(below.isEmpty()) {			// means empty, look for letter to fill up at below tile
			below.pullUpLetter();
		}
		setLetter(below.extractLetter());	// bully below tile to grab its letter! :P
	}
	
	public String getChar() { return letter.getChar(); }
	public int getPoints() {return letter.getPoints(); }
	
	// getters and setters
	public Letter getLetter() { return this.letter; }
	public void setLetter(Letter letter) { this.letter = letter; }

	public Tile getBelow() { return below; }
	


	

}
