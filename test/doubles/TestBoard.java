/**
 * 
 */
package doubles;

import player.entity.Board;
import player.entity.LetterGenerator;
import player.entity.Tile;

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
