package AssigmentSeven;

import java.util.Random;
import java.util.Scanner;

public class CardGuessingGame {

	public static final String[] rank = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	public static final String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
	private String rand_card=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardGuessingGame game = new CardGuessingGame();
	}
	
	public CardGuessingGame()
	{   
		String randomCrd=randRankAndSuit();
		Scanner s = new Scanner(System.in);
		System.out.println("Predict the card");
		System.out.println("Enter the rank : ");
		String r = s.next();
		String rank = r.toUpperCase();
		System.out.println("Enter the suit ");
		String su = s.next();
		String suit = su.toUpperCase();
		String card = rank + " " + suit;
		
		guessCard(card, randomCrd.toUpperCase());
	}
	
	public String randRankAndSuit()
	{
		Random rand = new Random();
		int r = rand.nextInt(rank.length);
		int s = rand.nextInt(suit.length);
		
		return rank[r]+" "+suit[s];
	}

	public void guessCard(String userCard,String randomCard)
	{
		if(!userCard.equals(randomCard))
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Predict the card again");
			System.out.println("Enter the rank : ");
			String r = s.next();
			String rank = r.toUpperCase();
			System.out.println("Enter the suit ");
			String su = s.next();
			String suit = su.toUpperCase();
			String final_card = rank + " " + suit;
			
			if(final_card.equals(randomCard)) {
				System.out.println("Your guess is incorrect");
				System.out.println("The correct answer is " + randomCard);
			} else {
				System.out.println("You are lost");
			}
		} else {
			System.out.print("Your guess is correct");
			System.out.println("The correct answer is " + randomCard);
		}
	}
}
