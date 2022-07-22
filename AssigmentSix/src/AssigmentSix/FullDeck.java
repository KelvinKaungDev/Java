package AssigmentSix;

import java.util.Random;

public class FullDeck {

	private String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] suits = {"Clubs", "Spade", "Hearts", "Diamonds"};
	
	String[] allCards = new String[52];
	
	public FullDeck()
	{	
		int i = 0;
		for (String rank : this.ranks)
		{
			for (String suit : this.suits)
			{
				allCards[i] = rank + " of " + suit;
				++i;
			}
		}
	}
	
	public String getDraw()
	{
		Random rand = new Random();
		int cardRand = rand.nextInt(allCards.length);
		
		return allCards[cardRand];
	}

	public void shuffle () {
	    int n = this.allCards.length;
	    Random gen = new Random();
	    
	    while (n > 1) {
	        int k = gen.nextInt(n--);
	        String temp = this.allCards[n];
	        this.allCards[n] = this.allCards[k];
	        this.allCards[k] = temp;
	    }
	}

}
