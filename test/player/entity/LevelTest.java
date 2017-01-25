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
public class LevelTest {
	
	private Level level;
	private TestBoard tb;
	private ScoreBoard sb;
	
	@Before
	public void setUp()
	{
		tb = new TestBoard();
		sb = new ScoreBoard(10, 20, 30);
		level = new Level(4, tb, sb);
	}
	
	@Test
	public void gettersAndSetters()
	{
		assertEquals(4, level.getLvl());
		assertTrue(level.isLocked());
		level.unLocked();
		assertFalse(level.isLocked());
		assertEquals(0, level.getHighScore());
	}
	
	@Test
	public void removeValidWordAndUpdateScore()
	{
		populateBoard();
		selectFRAGMENT();
		level.removeWordAndUpdateScore();
		assertEquals(19, level.getSb().getCurrentScore());
		assertEquals(1, level.getSb().getStars());
		assertEquals(19, level.getHighScore());
	}
	
	
	public void populateBoard()
	{
		LetterGenerator lg = LetterGenerator.getInstance();
		tb.setLetterToTile(lg, "F", 0);
		tb.setLetterToTile(lg, "R", 6);
		tb.setLetterToTile(lg, "A", 12);
		tb.setLetterToTile(lg, "G", 13);
		tb.setLetterToTile(lg, "M", 19);
		tb.setLetterToTile(lg, "E", 14);
		tb.setLetterToTile(lg, "N", 8);
		tb.setLetterToTile(lg, "T", 2);
		tb.fillRandomLetters();
	}
	
	public void selectFRAGMENT()
	{
		tb.select(0);
		tb.select(6);
		tb.select(12);
		tb.select(13);
		tb.select(19);
		tb.select(14);
		tb.select(8);
		tb.select(2);
	}

}
