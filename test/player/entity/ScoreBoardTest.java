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
public class ScoreBoardTest {
	
	private ScoreBoard sb;
	
	@Before
	public void setUp()
	{
		sb = new ScoreBoard(10, 20, 30);
	}
	
	@Test
	public void createScoreBoard10_20_30() {
		assertNotNull(sb);
		assertEquals(10, sb.getFirst());
		assertEquals(20, sb.getSecond());
		assertEquals(30, sb.getThird());
		assertEquals(0, sb.getCurrentScore());
	}
	
	@Test
	public void updateScoreWith8ThenWith2ThenWith13ThenWith10()
	{
		sb.updateScore(8);
		assertEquals(8, sb.getCurrentScore());
		assertEquals(0, sb.getStars());
		
		sb.updateScore(2);
		assertEquals(10, sb.getCurrentScore());
		assertEquals(1, sb.getStars());
		
		sb.updateScore(13);
		assertEquals(23, sb.getCurrentScore());
		assertEquals(2, sb.getStars());
		
		sb.updateScore(10);
		assertEquals(33, sb.getCurrentScore());
		assertEquals(3, sb.getStars());
	}

}
