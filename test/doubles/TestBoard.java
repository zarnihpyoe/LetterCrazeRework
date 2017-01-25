/**
 * 
 */
package doubles;

import player.entity.Board;
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

}
