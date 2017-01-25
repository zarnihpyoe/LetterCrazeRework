/**
 * 
 */
package entity;

/**
 * @author Zarni Phyo
 *
 */
public class Level {

	private final int lvl;
	private Board b;
	private ScoreBoard sb;
	private boolean locked;
	private int highScore;
	

	public Level(int lvl, Board b, ScoreBoard sb, boolean locked, int highScore)
	{
		this.lvl = lvl;
		this.b = b;
		this.sb = sb;
		this.locked = locked;
		this.highScore = highScore;
		initialize();
	}
	
	public Level (int lvl, Board b, ScoreBoard sb)
	{
		this(lvl, b, sb, lvl>3, 0);
	}
	
	public void initialize()
	{
		b.fillRandomLetters();
	}
	
	public void removeWordAndUpdateScore()
	{
		sb.updateScore(b.removeWord());
		// update high score if current score is higher
		if(sb.getScore() > highScore) {
			highScore = sb.getScore();
		}
		b.fillRandomLetters();
	}
	
	public void selectTile(int i)
	{
		b.select(i);
	}
	
	public int getScore()
	{
		return sb.getScore();
	}
	
	public int getStars()
	{
		return sb.getStars();
	}

	// getters and setters
	public int getLvl() { return lvl; }

	public boolean isLocked() { return locked; }
	public void unLocked() { this.locked = false; }
	
	public int getHighScore() { return highScore; }
	public void setHighScore(int highScore) { this.highScore = highScore; }

}
