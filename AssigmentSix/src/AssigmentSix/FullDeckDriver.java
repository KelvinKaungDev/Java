package AssigmentSix;

public class FullDeckDriver {

	public static void main(String[] args) 
	{
		FullDeck cards = new FullDeck();
		cards.shuffle();
		for (String card: cards.allCards) {
			System.out.println(card);
		}
	}

}
