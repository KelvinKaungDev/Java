package ExerciseTwo;

public class ExerciseTwoOutput {

	public static void main(String[] args) {
		int [][] lotteryCard = {
				{23, 45, 78},
				{45, 67, 90},
				{23, 12, 90}
			};

		for(int i = 0; i < 3; i++)
		{
			for(int y = 0; y < 3; y++)
			{
				System.out.println(lotteryCard[i][y]);
			}
		}
		
	}

}
