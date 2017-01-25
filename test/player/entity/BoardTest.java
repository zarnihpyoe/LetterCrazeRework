/**
 * 
 */
package player.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import doubles.TestBoard;

/**
 * @author Zarni Phyo
 *
 */
public class BoardTest {

	private TestBoard tb;
	
	@Before
	public void setUp()
	{
		tb = new TestBoard();
	}
	
	@Test
	public void firstTimeFillRandLetters()
	{
		assertFalse(tb.noEmptyTilesLeft());
		tb.fillRandomLetters();
		assertTrue(tb.noEmptyTilesLeft());
	}
	
	@Test
	public void adjacency()
	{
		assertTrue(tb.isAdjacent(14, 13));		// left
		assertTrue(tb.isAdjacent(14, 15));		// right
		assertTrue(tb.isAdjacent(14, 8));		// top
		assertTrue(tb.isAdjacent(14, 20));		// bottom
		assertTrue(tb.isAdjacent(14, 7));		// top left
		assertTrue(tb.isAdjacent(14, 21));		// bottom right
		assertTrue(tb.isAdjacent(14, 9));		// top right
		assertTrue(tb.isAdjacent(14, 19));		// bottom left
		
		assertFalse(tb.isAdjacent(14, 14));		// self
		assertFalse(tb.isAdjacent(14, 12));		// other
	}
	
	@Test
	public void isValidWord()
	{
		assertTrue(tb.isValidWord());
	}
	
	@Test
	public void invalidSelectionLessThan3()
	{
		tb.select(0);
		tb.select(7);
		assertFalse(tb.isValidSelection());
	}
	
	@Test
	public void invalidSelectionNotAdjacent()
	{
		tb.select(0);
		tb.select(7);
		tb.select(15);
		assertFalse(tb.isValidSelection());
	}
	
	@Test
	public void validSelection()
	{
		tb.select(0);
		tb.select(7);
		tb.select(14);
		assertTrue(tb.isValidSelection());
	}
	
	
}
