package dictionary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EngDictionaryTest {

	@Before
	public void setUp()
	{
		
	}
	
	@Test
	public void isWord()
	{
		assertTrue(EngDictionary.isWord("DOG"));
		assertFalse(EngDictionary.isWord("AIOEU"));
	}

}
