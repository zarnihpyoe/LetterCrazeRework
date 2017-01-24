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
	public void createLetterE() 
	{
		assertNotNull(letter);
		assertEquals("E", letter.getChar());
		assertEquals(1, letter.getPoints());
	}
	
	@Test
	public void generateRandomLetterNotNull() {
		letter = LetterGenerator.getInstance().generateRandomLetter();
		assertNotNull(letter);
		letter = LetterGenerator.getInstance().generateRandomLetter();
		assertNotNull(letter);
	}
	

}
