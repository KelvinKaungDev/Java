package AssigmentFour;

import java.util.Arrays;
import java.util.Scanner;

public class VoteCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the candidates number : ");
		int candidateNumber = scanner.nextInt();
		
		System.out.print("Enter the voter number : ");
		int voterNumber = scanner.nextInt();
		
		int[] votes = new int[voterNumber];
		
		for(int i = 0; i < votes.length; i++) {
			votes[i] = scanner.nextInt();
		}
		
		int[] voteCount = new int[candidateNumber];
		
		for(int i = 0; i < votes.length; i++) {
			voteCount[votes[i] - 1]++;
		}
		
		int maximun = getMaximum(voteCount);
		
		for (int i = 0; i < voteCount.length; i++) {
			if(voteCount[i] == maximun) {
				System.out.println(i + 1);
			}
		}
		
	}
	
	public static int getMaximum(int[] voteCount) {
		int max = voteCount[0];
		
		for(int i = 1; i < voteCount.length; i++) {
			if(voteCount[i] > max) {
				max = voteCount[i];
			}
		}
		return max;
	}
		
}
