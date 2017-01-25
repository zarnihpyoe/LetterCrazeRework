/**
 * 
 */
package player.entity;

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
	}
	
	public Level (int lvl, Board b, ScoreBoard sb)
	{
		this(lvl, b, sb, lvl>3, 0);
	}
	
	public void removeWordAndUpdateScore()
	{
		sb.updateScore(b.removeWord());
		// update high score if current score is higher
		if(sb.getCurrentScore() > highScore) {
			highScore = sb.getCurrentScore();
		}
	}

	public int getLvl() { return lvl; }

	public Board getB() { return b; }

	public ScoreBoard getSb() { return sb; }

	public boolean isLocked() { return locked; }
	public void unLocked() { this.locked = false; }
	
	public int getHighScore() { return highScore; }
	public void setHighScore(int highScore) { this.highScore = highScore; }

}
