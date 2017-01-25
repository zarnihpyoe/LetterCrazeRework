/**
 * 
 */
package player.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import doubles.TestBoard;
import entity.LetterGenerator;
import entity.Level;
import entity.ScoreBoard;

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
		assertEquals(19, level.getScore());
		assertEquals(1, level.getStars());
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
	}
	
	public void selectFRAGMENT()
	{
		level.selectTile(0);
		level.selectTile(6);
		level.selectTile(12);
		level.selectTile(13);
		level.selectTile(19);
		level.selectTile(14);
		level.selectTile(8);
		level.selectTile(2);
	}

}
