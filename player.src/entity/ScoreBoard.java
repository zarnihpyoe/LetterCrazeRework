/**
 * 
 */
package entity;

/**
 * @author Zarni Phyo
 *
 */
public class ScoreBoard {
	
	private final int first, second, third;
	private int score;
	
	public ScoreBoard(int first, int second, int third)
	{
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public void updateScore(int delta)
	{
		score += delta;
	}
	
	public int getStars()
	{
		if(score < first) return 0;
		if(score < second) return 1;
		if(score < third) return 2;
		return 3;
	}
	
	// getters and setters
	public int getFirst() { return first; }

	public int getSecond() { return second; }

	public int getThird() {	return third; }

	public int getScore() { return score; }

//	public int getCurrentStars() { return currentStars; }

}
