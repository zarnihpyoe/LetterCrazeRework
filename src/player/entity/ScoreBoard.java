/**
 * 
 */
package player.entity;

/**
 * @author Zarni Phyo
 *
 */
public class ScoreBoard {
	
	private final int first, second, third;
	private int currentScore;
//	private int currentStars;
	
	public ScoreBoard(int first, int second, int third)
	{
		this.first = first;
		this.second = second;
		this.third = third;
	}

	public void updateScore(int delta)
	{
		currentScore += delta;
	}
	
	public int getStars()
	{
		if(currentScore < first) return 0;
		if(currentScore < second) return 1;
		if(currentScore < third) return 2;
		return 3;
	}
	
	// getters and setters
	public int getFirst() { return first; }

	public int getSecond() { return second; }

	public int getThird() {	return third; }

	public int getCurrentScore() { return currentScore; }

//	public int getCurrentStars() { return currentStars; }

}
