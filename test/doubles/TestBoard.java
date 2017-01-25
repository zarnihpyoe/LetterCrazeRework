/**
 * 
 */
package doubles;

import entity.Board;
import entity.LetterGenerator;
import entity.Tile;

/**
 * @author Zarni Phyo
 *
 */
public class TestBoard extends Board {

	/**
	 * 
	 */
	public TestBoard() {
		super();
	}
	
	
	public boolean noEmptyTilesLeft()
	{
		for(Tile t : tiles) {
			if(t.isEmpty()) { return false; }
		}
		return true;
	}
	
	public void setLetterToTile(LetterGenerator lg, String character, int i)
	{
		try
		{
			tiles[i].setLetter(lg.get(character));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
