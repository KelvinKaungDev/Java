package Exercise2D;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FullDeck {

	public static void main(String[] args) {
		String[] name = {"Kaung", "Htet", "Oo", "Thri", "Htet"};
		List<String> NameList = Arrays.asList(name);
		
		Collections.shuffle(NameList);
		
		for(String e : NameList)
		{
			System.out.print(e);
		}
		
}
}
