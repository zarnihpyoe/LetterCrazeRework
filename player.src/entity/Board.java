/**
 * 
 */
package entity;

import java.util.ArrayList;
import java.util.List;

import dictionary.EngDictionary;

/**
 * @author Zarni Phyo
 *
 */
public class Board {
	
	public static final int ROW = 6;
	public static final int COL = 6;
	public static final int TOTAL = ROW * COL;
	
	protected Tile[] tiles;
	protected List<Integer> selectedTiles;
	
	public Board()
	{
		this.tiles = new Tile[TOTAL];
		this.selectedTiles = new ArrayList<>();
		// initializing
		for(int i=0; i<TOTAL; i++) {
			tiles[i] = new Tile();
		}
		// linking
		for(int i=0; i<TOTAL-COL; i++) {
			tiles[i].isAbove(tiles[i+COL]);
		}
	}
	
	public void fillRandomLetters()
	{
		LetterGenerator lg = LetterGenerator.getInstance();
		for(Tile t : tiles) {
			if(t.isEmpty()) {
				t.setRandomLetter(lg);
			}
		}
	}
	
	public void select(int i)
	{
		selectedTiles.add(i);
	}
	
	// not tested yet
	public final int removeWord()
	{
		int score = 0;
		if(isTheWordValid()) {
			for(int i : selectedTiles) {
				score += tiles[i].getPoints();
				tiles[i].extractLetter();
			}
			applyGravity();
			fillRandomLetters();
		}
		selectedTiles.clear();
		return score;
	}
	
	// not tested yet
	public final boolean isTheWordValid()
	{
		return isValidSelection() && isValidWord();
	}

	// not tested yet
	private void applyGravity()
	{
		// iterate over the previously selected tiles
		for(int i : selectedTiles) {
			tiles[i].pullUpLetter();
		}
	}
	
	
	public boolean isValidSelection()
	{
		if(selectedTiles.size() < 3) { return false; }		// can't remove a word shorter than 3
		for(int i=1; i<selectedTiles.size(); i++) {
			if (!isAdjacent(selectedTiles.get(i-1), selectedTiles.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidWord()
	{
		StringBuilder sb = new StringBuilder();
		for(int i : selectedTiles) {
			sb.append(tiles[i].getChar());
		}
		String theWord = sb.toString();
		return EngDictionary.isWord(theWord);
	}
	
	public boolean isAdjacent(int i, int j)
	{
		int diff = Math.abs(i-j);
		return diff == 1 || 		// left or right
				diff == COL ||		// top or bottom
				diff == COL+1 ||	// \ diagonal
				diff == COL-1;		// / diagonal
	}

}
