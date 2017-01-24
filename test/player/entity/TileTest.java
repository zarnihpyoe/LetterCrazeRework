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
	
	private Tile tile0, tile1, tile2;
	
	@Before
	public void setUp() 
	{
		tile0 = new Tile();
		tile1 = new Tile();
		tile2 = new Tile();
	}
	
	@Test
	public void createTile() 
	{
		assertNotNull(tile0);
		assertTrue(tile0.isEmpty());
	}
	
	@Test
	public void createTileWithLetterEThenExtractLetter() 
	{
		Letter l = new Letter("E", 1);
		tile0.setLetter(l);
		assertEquals("E", tile0.getChar());
		assertEquals(1, tile0.getPoints());
		
		assertEquals(l, tile0.extractLetter());
		assertTrue(tile0.isEmpty());
	}
	
	
	@Test
	public void createTileWithRandomLetter()
	{
		assertTrue(tile0.isEmpty());
		tile0.setRandomLetter(LetterGenerator.getInstance());
		assertNotNull(tile0.getLetter());
	}
	
	@Test
	public void create2Tiles_LinkThem_SetLetterTo2ndTile_1stTilePullUp()
	{
		tile0.isAbove(tile1);
		assertEquals(tile1, tile0.getBelow());
		
		Letter l = new Letter("E", 1);
		tile1.setLetter(l);
		assertEquals(l, tile1.getLetter());
		tile0.pullUpLetter();
		assertEquals(l, tile0.getLetter());
		assertTrue(tile1.isEmpty());
	}
	
	@Test
	public void create3Tiles_LinkThem_SetLetterTo3rdTile_1stTilePullUp_2ndTilePullUp()
	{
		tile0.isAbove(tile1);
		tile1.isAbove(tile2);
		
		Letter l = new Letter("E", 1);
		tile2.setLetter(l);
		
		tile0.pullUpLetter();
		assertEquals(l, tile0.getLetter());
		assertTrue(tile1.isEmpty());
		assertTrue(tile2.isEmpty());
		
		tile1.pullUpLetter();
		assertEquals(l, tile0.getLetter());
		assertTrue(tile1.isEmpty());
		assertTrue(tile2.isEmpty());
	}

}
