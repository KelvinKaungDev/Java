package AssigmentSix;

import java.util.Random;

public class Card {

	private String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] suit = {"Clubs", "Spade", "Hearts", "Diamonds"};
	
	public Card() 
	{
		Random generator = new Random();
		int rank_random = generator.nextInt(this.rank.length);
		int suit_random = generator.nextInt(this.suit.length);
		
		System.out.println(this.rank[rank_random] + " " + this.suit[suit_random]);
		
 	}
}
