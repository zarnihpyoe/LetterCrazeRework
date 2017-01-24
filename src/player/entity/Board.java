/**
 * 
 */
package player.entity;

/**
 * @author Zarni Phyo
 *
 */
public class Board {
	
	public static final int ROW = 6;
	public static final int COL = 6;
	
	private Tile[] tiles;
	private int[] selectedTiles;
	
	public Board()
	{
		this.tiles = new Tile[ROW*COL];
	}
	
	public void applyGravity()
	{
		// iterate over the previously selected tiles
		tiles[1].pullUpLetter();
	}

}
