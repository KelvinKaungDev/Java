package AssigmentFour;

public class ReverseWord {

	public static void main (String[] args) {
	       String reverseOutput = reverse("How are you?");
	       System.out.print(reverseOutput);
	}
	
	public static String reverse(String word) {
		String[] splitted = word.split(" ");
		String result = "";
		for(String str: splitted) {
			char[] out = new char[str.length()];
			for(int i = str.length() - 1; i >= 0; --i) {
				out[str.length() - 1 - i] = str.charAt(i);
			}
			result += "\n" + String.valueOf(out).toUpperCase().replaceAll("[?/@!.$,^$]", "");
		}
		return result.substring(1);
	}

}
