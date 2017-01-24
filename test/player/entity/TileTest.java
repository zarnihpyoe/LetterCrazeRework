/**
 * 
 */
package player.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Zarni Phyo
 *
 */
public class TileTest {
	
	private Tile tile;
	
	@Before
	public void setUp() 
	{
		tile = new Tile();
	}
	
	@Test
	public void createTileNotNull() 
	{
		assertNotNull(tile);
	}
	
	@Test
	public void createTileWithLetterE() 
	{
		tile.setLetter(new Letter("E", 1));
		assertEquals("E", tile.getChar());
		assertEquals(1, tile.getPoints());
	}
	
	@Test
	public void createTileWithRandomLetter()
	{
		assertNull(tile.getLetter());
		tile.setRandomLetter(LetterGenerator.getInstance());
		assertNotNull(tile.getLetter());
	}

}
