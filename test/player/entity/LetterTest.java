package player.entity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LetterTest {
	
	private Letter letter;
	
	@Before
	public void setUp()
	{
		letter = new Letter("e", 1);
	}
	
	/**
	 * 
	 */
	@Test
	public void createLetterENotNull() 
	{
		assertNotNull(letter);
		assertEquals("E", letter.getChar());
		assertEquals(1, letter.getPoints());
	}
	

}
