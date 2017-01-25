/**
 * 
 */
package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author Zarni Phyo
 *
 */
public class LetterGenerator {
	
	private static LetterGenerator lg;
	private final List<Double> freqs = new ArrayList<Double>();
	private final HashMap<Integer, Letter> letters = new HashMap<Integer, Letter>();
	
	private LetterGenerator() 
	{
		freqs.addAll(Arrays.asList(12.70, 21.76, 29.93, 37.43, 44.40, 51.15, 57.48,
				63.57, 69.56, 73.81, 77.84, 80.62, 83.38, 85.79, 88.15, 90.38, 92.40, 94.37, 96.30,
				97.79, 98.77, 99.54, 99.69, 99.84, 99.94, 100.0));
		
		letters.put(0, new Letter("E", 1));
		letters.put(1, new Letter("T", 1));
		letters.put(2, new Letter("A", 2));
		letters.put(3, new Letter("O", 2));
		letters.put(4, new Letter("I", 2));
		letters.put(5, new Letter("N", 2));
		letters.put(6, new Letter("S", 2));
		letters.put(7, new Letter("H", 2));
		letters.put(8, new Letter("R", 2));
		letters.put(9, new Letter("D", 3));
		letters.put(10, new Letter("L", 3));
		letters.put(11, new Letter("C", 3));
		letters.put(12, new Letter("U", 3));
		letters.put(13, new Letter("M", 3));
		letters.put(14, new Letter("W", 3));
		letters.put(15, new Letter("F", 4));
		letters.put(16, new Letter("G", 4));
		letters.put(17, new Letter("Y", 4));
		letters.put(18, new Letter("P", 4));
		letters.put(19, new Letter("B", 4));
		letters.put(20, new Letter("V", 5));
		letters.put(21, new Letter("K", 5));
		letters.put(22, new Letter("J", 7));
		letters.put(23, new Letter("X", 7));
		letters.put(24, new Letter("Qu", 8));
		letters.put(25, new Letter("Z", 8));
	}
	
	public static LetterGenerator getInstance() 
	{
		if(lg == null) {
			lg = new LetterGenerator();
		}
		return lg;
	}
	
	public Letter generateRandomLetter() 
	{
		double rand = new Random().nextDouble()*100;
		System.out.println(rand);
		// linear complexity ; need to improve if have time
		for(int i=0; i<freqs.size(); i++) {
			if(rand < freqs.get(i)) {
				System.out.println(i);
				return letters.get(i);
			}
		}
		return letters.get(0);		// will never happens
	}
	
	public Letter get(String letter) throws LetterGeneratorException
	{
		letter = letter.toUpperCase();
		switch(letter) {
			case "E":
				return letters.get(0);
			case "T":
				return letters.get(1);
			case "A":
				return letters.get(2);
			case "O":
				return letters.get(3);
			case "I":
				return letters.get(4);
			case "N":
				return letters.get(5);
			case "S":
				return letters.get(6);
			case "H":
				return letters.get(7);
			case "R":
				return letters.get(8);
			case "D":
				return letters.get(9);
			case "L":
				return letters.get(10);
			case "C":
				return letters.get(11);
			case "U":
				return letters.get(12);
			case "M":
				return letters.get(13);
			case "W":
				return letters.get(14);
			case "F":
				return letters.get(15);
			case "G":
				return letters.get(16);
			case "Y":
				return letters.get(17);
			case "P":
				return letters.get(18);
			case "B":
				return letters.get(19);
			case "V":
				return letters.get(20);
			case "K":
				return letters.get(21);
			case "J":
				return letters.get(22);
			case "X":
				return letters.get(23);
			case "Q":
				return letters.get(24);
			case "Z":
				return letters.get(25);
		}
		throw new LetterGeneratorException("Cannot generate " + letter + " letter.");
	}
	

}
